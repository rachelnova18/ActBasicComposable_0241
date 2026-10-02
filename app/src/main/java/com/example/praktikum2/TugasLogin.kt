package com.example.praktikum2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
// Gambar Background
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Kontainer Utama
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(45.dp))
            // Teks "Login" diperbesar
            Text(
                text = "Login",
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            // Teks Keterangan diperbesar
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 18.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Logo diperbesar
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(170.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Teks "Nama" diperbesar
            Text(
                text = "Nama",
                fontSize = 18.sp,
                color = Color.Red
            )
            // Teks Nama Lengkap diperbesar
            Text(
                text = "Rachel Nova Sari",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

        }
    }
}