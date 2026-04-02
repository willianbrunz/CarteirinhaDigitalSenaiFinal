package com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.component.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.carteirinhadigitalsenai.R
import com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.component.LabelText
import com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.component.QrCode
import com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.component.ValueText


@Composable
fun CarteirinhaScreen (modifier: Modifier = Modifier) {
    Box() {
        Image(
            painter = painterResource(R.drawable.images),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(.7f)

        )

        Column(
            modifier = modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .weight(.6f)

            )
            Spacer(
                modifier = Modifier
                    .weight(.1f)
            )
            Image(
                painter = painterResource(R.drawable.user_male_circle__v2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .aspectRatio(1f)
                    .clip(CircleShape)
            )
            Row(
                modifier = Modifier
                    .weight(.6f)
                    .fillMaxSize(.9f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Nome:",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Willian Bruno",
                    modifier = Modifier.weight(4f)
                )
            }
            Row(
                modifier = Modifier
                    .weight(.6f)
                    .fillMaxSize(.9f),
                verticalAlignment = Alignment.CenterVertically
            ){

                LabelText(
                    "Curso:",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Desenvolvimento de Sistemas",
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(4f)
                )
            }
            QrCode(
                "90000000001417130546",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
            )
        }
    }
}