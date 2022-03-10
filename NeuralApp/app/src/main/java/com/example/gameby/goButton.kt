package com.example.gameby

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Go(){
    var clicked by remember { mutableStateOf(false) }
    var text: String = "join us ->"
   // if (clicked) name = "Glad you're here" else name = "The Electroverse"

    OutlinedButton(modifier = Modifier.padding(30.dp),
        onClick = { clicked = !clicked   },
        shape = CircleShape,
        elevation = ButtonDefaults.elevation(10.dp)
    )

    {
        Text(
            text = if(!clicked) text else "~~Welcome~~",
            color = Color.Blue,
            fontSize = 28.sp,
            style = MaterialTheme.typography.caption,
            modifier = Modifier.padding(start = 14.dp, end = 14.dp, top = 5.dp, bottom = 5.dp)
        )
    }
}