package com.evanesh.intentcalcweb.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
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
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.app.ComponentActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.platform.LocalContext


@Composable
fun Intent_Screen(navController: NavHostController) {

    val context = LocalContext.current


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
            onClick = {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                if (ContextCompat.checkSelfPermission(
                        context,
                        android.Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        context as Activity,
                        arrayOf(android.Manifest.permission.CALL_PHONE),
                        1
                    )
                } else {
                    context.startActivity(intent)
                }},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Call",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = { val uri = Uri.parse("smsto:07456789")

                val intent = Intent(Intent.ACTION_SENDTO, uri)

                intent.putExtra("Hello", "How is todays weather")

                context.startActivity(intent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "SMS",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {  val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { context.startActivity(it) }},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "STK",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {
                val phone = "+34666777888"

                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

                context.startActivity(intent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Dial",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {val shareIntent = Intent(Intent.ACTION_SEND)

                shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                shareIntent.type = "text/plain"

                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

                context.startActivity(shareIntent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Share",
                color = Color.Magenta)

        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {
                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                startActivityForResult(context as Activity,takePictureIntent,1,null)},
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
            Text(text = "Email",
                color = Color.Magenta)

        }
    }


}

@Preview
@Composable
private fun IntentPrev() {
    Intent_Screen(rememberNavController())
    
}