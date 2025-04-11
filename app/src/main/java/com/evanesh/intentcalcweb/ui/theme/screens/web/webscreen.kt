package com.evanesh.intentcalcweb.ui.theme.screens.web

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Web_Screen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {

        Text(text = "Web Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            
        )
        OutlinedButton(onClick =  { /*TODO*/},
            modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(16.dp)) {
            Text(text = "Google",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp)

            }

    }

}

@Preview
@Composable
private fun WebPrev() {
    Web_Screen(rememberNavController())

}