package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {

                FzWithoutModifier("不传入 Modifier 示例","示例")
                FzWithModifier("蓝色背景的列",
                         modifier = Modifier
                             .fillMaxSize() // 占满屏幕
                             .wrapContentSize(Alignment.Center) // 在占满的区域里居中
                        .background(Color.Blue)
                        .padding(32.dp))
            }
        }
    }
}

@Composable
fun FzWithoutModifier(title: String,a: String){
    Column(
        modifier = Modifier.background(Color.Yellow).padding(16.dp)
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.background(Color.Green)
        )

    }


}


@Composable
fun FzWithModifier(title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier // 用外部传进来的 Modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.background(Color.Green)
        )
    }
}