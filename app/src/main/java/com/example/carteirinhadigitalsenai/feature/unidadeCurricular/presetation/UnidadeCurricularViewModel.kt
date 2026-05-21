package com.example.carteirinhadigitalsenai.feature.unidadeCurricular.presetation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carteirinhadigitalsenai.feature.unidadeCurricular.data.repository.FakeUnidadeCurricularRepository
import com.example.carteirinhadigitalsenai.feature.unidadecurricular.data.repository.UnidadeCurricularRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class UnidadeCurricularViewModel (
    private val repository: UnidadeCurricularRepository = FakeUnidadeCurricularRepository()
): ViewModel(){

    private val _uiState = MutableStateFlow(UnidadeCurricularUiState())
    val uiState: StateFlow<UnidadeCurricularUiState> = _uiState.asStateFlow()

    init{

    }

fun onEvent(event: UnidadeCurricularEvent) {
    when (event) {
        UnidadeCurricularEvent.OnVoltarClick -> Unit
        UnidadeCurricularEvent.OnCarregarDados,
        UnidadeCurricularEvent.OnTentarNovamentoClick -> carregarUnidadeCurriculares()
        }
    }

    private fun carregarUnidadeCurriculares() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    errorMessage = null
                )
            }

            val result = repository.buscarUnidadeCurriculares()

            result
                .onSuccess { unidades ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            unidadesCurriculares = unidades,
                            errorMessage = null
                        )
                    }
                }
                .onFailure { throwable ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = throwable.message ?: "Erro ao carregar unidades curriculares."
                    )
                }
            }
        }
    }

}