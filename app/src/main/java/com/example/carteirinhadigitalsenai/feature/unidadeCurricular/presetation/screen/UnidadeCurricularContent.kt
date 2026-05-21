package com.example.carteirinhadigitalsenai.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalsenai.feature.unidadecurricular.domain.model.UnidadeCurricular

fun UnidadeCurricularContent(
    modifier: Modifier,
    unidadeCurriculares: List<UnidadeCurricular>
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
                verticalArrangement = Arrangement.spaceBy(12.dp)
    ) {
        itens(unidadeCurriculares)
    }
}