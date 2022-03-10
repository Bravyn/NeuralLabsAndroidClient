package com.example.gameby

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class hello(val name: String, val greeting: String)

val hellos = listOf<hello>(
    hello("Iana", "i got a new leve! let's check it out guys"),
    hello("Mali", "hey, i like the idea"),
    hello("Hana", "oh sure, let's give it a try"),

)

@Composable
fun Hellos(hello: List<hello>){
    hello.forEach{it ->
        Surface(elevation = 2.dp, color = Color.Cyan){
            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.padding(10.dp)){
                Text(
                    text = it.name + ": ",
                    color = MaterialTheme.colors.onSurface,
                    fontSize = 22.sp
                )
                Text(
                    text = it.greeting,
                    color = MaterialTheme.colors.primaryVariant,
                    fontSize = 22.sp,
                    style = MaterialTheme.typography.caption

                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}