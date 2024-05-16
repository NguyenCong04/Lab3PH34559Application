package com.example.lab3ph34559application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExampleTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutExampleTwo()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutExampleTwo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ContentExampleTwo()
    }
}


@Composable
fun ContentExampleTwo() {
    var text = remember {
        mutableStateOf("Hello, Nguyễn Tất Công - PH34559")
    }

    Text(
        text = text.value,
        fontSize = 18.sp,
        fontFamily = FontFamily.Serif
    )
    Spacer(modifier = Modifier.height(10.dp))
    Button(
        onClick = {
            text.value = "Say hi nè  !!!"
        },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(Color.Black),
        modifier = Modifier.width(150.dp)
    ) {
        Text(
            text = "Say hi",
            fontFamily = FontFamily.Serif
        )
    }


}








