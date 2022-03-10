package com.example.gameby

import androidx.compose.material.Button
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(name: String, location: String) {
    Column(
        modifier =
        Modifier
            .fillMaxSize()
            .padding(18.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "$name!",
            fontSize = 32.sp,
            letterSpacing = 10.sp,
            style = MaterialTheme.typography.caption,
            color = Color.Yellow
            //fontFamily = "Verdana"

        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Click below to join us now...",
            fontSize = 28.sp,
            style = MaterialTheme.typography.body1,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(95.dp))

        //Hellos(hello = hellos)

        Go()
    }

}
