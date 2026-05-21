package com.example.carteirinhadigitalsenai.feature.unidadeCurricular.presetation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.carteirinhadigitalsenai.feature.unidadeCurricular.presetation.UnidadeCurricularViewModel
import com.example.carteirinhadigitalsenai.feature.unidadecurricular.presentation.screen.UnidadeCurricularContent

@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
    viewModel: UnidadeCurricularViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    UnidadeCurricularContent()
}