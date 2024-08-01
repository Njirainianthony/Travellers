package com.example.travellers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travellers.ui.theme.TravellersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo()
            DemoPreview()

        }
    }
}

@Composable
fun Demo(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)

        ){

        Text(
            text = "Travellers",
            color = Color.Red,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center



        )

        Text(
            text = "Choose your favourite destination: ",
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )

        Text(text ="1. New york")
        Text(text ="2. Paris")
        Text(text ="3. Bogota")
        Text(text ="4. Medellin")
        Text(text ="5. Madrid")

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp)
            )
        {
            Text(
                text = "Other destination",
                color = Color.Cyan
            )
        }


    }




}

@Composable
@Preview(showBackground = true)
fun DemoPreview(){
    Demo()

}

