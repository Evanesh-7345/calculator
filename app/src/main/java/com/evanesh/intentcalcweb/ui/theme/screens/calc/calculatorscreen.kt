package com.evanesh.intentcalcweb.ui.theme.screens.calc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navController:NavHostController) {
    var firstNum by remember { mutableStateOf(TextFieldValue("")) }
    var secondNum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Answer: $answer",
            color = Color.Green,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )

        OutlinedTextField(
            value = firstNum,
            onValueChange = { firstNum = it },
            label = { Text(text = "Enter First Number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = secondNum,
            onValueChange = { secondNum = it },
            label = { Text(text = "Enter Second Number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        // Operation buttons
        OutlinedButton(
            onClick = {
                val myfirstnum= firstNum.text.trim()
                val mysecondnum= secondNum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else {
                    val myanswer = myfirstnum.toDouble() +mysecondnum.toDouble()
                    answer = myanswer.toString()}
            },
            modifier = Modifier.width(60.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "+", fontSize = 30.sp)
        }

        OutlinedButton(
            onClick = {
                val myfirstnum= firstNum.text.trim()
                val mysecondnum= secondNum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else {
                    val myanswer = myfirstnum.toDouble() -mysecondnum.toDouble()
                    answer = myanswer.toString()}
            },
            modifier = Modifier.width(60.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "-", fontSize = 30.sp)
        }

        OutlinedButton(
            onClick = {
                val myfirstnum= firstNum.text.trim()
                val mysecondnum= secondNum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else {
                    val myanswer = myfirstnum.toDouble() *mysecondnum.toDouble()
                    answer = myanswer.toString()}
            },
            modifier = Modifier.width(60.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "*", fontSize = 30.sp)
        }

        OutlinedButton(
            onClick = {
                val myfirstnum= firstNum.text.trim()
                val mysecondnum= secondNum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else {
                    val myanswer = myfirstnum.toDouble() /mysecondnum.toDouble()
                    answer = myanswer.toString()}
            },
            modifier = Modifier.width(60.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "/", fontSize = 30.sp)
        }


    }
}

@Preview
@Composable
private fun Home_Prev() {
    Calc_Screen(rememberNavController())

}