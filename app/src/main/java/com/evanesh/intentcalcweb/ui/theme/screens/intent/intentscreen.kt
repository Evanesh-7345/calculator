package com.evanesh.intentcalcweb.ui.theme.screens.intent

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navController: NavHostController) {


    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text(text = "Intent Screen",
            fontSize = 30.sp,
            color = Color.Red)
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Call",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "SMS",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "STK",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Dial",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Share",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Camera",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Call",
                color = Color.Magenta)

        }
    }


}

@Preview
@Composable
private fun IntentPrev() {
    Intent_Screen(rememberNavController())
    
}