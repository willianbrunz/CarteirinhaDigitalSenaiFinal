package com.example.carteirinhadigitalsenai.feature.unidadeCurricular.presetation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object OnVoltarClick : UnidadeCurricularEvent
    data object OnTentarNovamentoClick : UnidadeCurricularEvent
}