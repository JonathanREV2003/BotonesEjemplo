package com.example.programa1

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.programa1.botones.BotonNormal
import com.example.programa1.botones.Botton2
import com.example.programa1.botones.BottonText
import com.example.programa1.botones.ButtonIcono
import com.example.programa1.botones.ButtonOutline
import com.example.programa1.botones.ButtonSwich
import com.example.programa1.botones.DarkMode
import com.example.programa1.botones.FloatingAction
import com.example.programa1.ui.theme.PROGRAMA1Theme

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}
@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        BotonNormal()
        Space()
        Botton2()
        Space()
        BottonText()
        Space()
        ButtonOutline()
        Space()
        ButtonIcono()
        Space()
        ButtonSwich()
        Space()
        DarkMode(darkMode= darkMode)
        Space()
        FloatingAction()

    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val darkMode =remember{ mutableStateOf(false) }
            PROGRAMA1Theme(darkTheme=darkMode.value){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ){
                    Content(darkMode)
                }
            }


        }
    }
}

