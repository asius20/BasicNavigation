package com.example.littlelemon2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AdditionalScreen(navController: NavController){
    Column (modifier = Modifier. fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

        Text(text = "Additional Screen",
            fontSize = 48.sp,
            textAlign = TextAlign.Center,
        )

        Button(onClick = {
            navController.navigate(DashBoard.route)
        }) {
            Text(text = "DashBoard")
        }
    }
}