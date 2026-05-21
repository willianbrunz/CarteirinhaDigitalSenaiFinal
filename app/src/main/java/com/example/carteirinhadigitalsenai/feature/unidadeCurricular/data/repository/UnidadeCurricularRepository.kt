package com.example.carteirinhadigitalsenai.feature.unidadecurricular.data.repository

import com.example.carteirinhadigitalsenai.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository{
    suspend fun buscarUnidadeCurriculares(): Result<List<UnidadeCurricular>>
}