package com.example.carteirinhadigitalsenai.feature.unidadeCurricular.presetation

import com.example.carteirinhadigitalsenai.feature.unidadecurricular.domain.model.UnidadeCurricular
data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)