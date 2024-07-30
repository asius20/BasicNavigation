package com.example.littlelemon2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.littlelemon2.ui.theme.LittleLemon2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            mainPanel("\n \nSalam alaykum world!")
        }
    }
}
//this is to test the pull request
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun mainPanel(name: String){
    Text(text = name,
        fontSize = 32.sp ,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleLemon2Theme {
        Greeting("Android")
    }
}