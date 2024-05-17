package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Column {
    Text(
        text= "\n►Acordo 5:30;" +
                "\n►Tomo um banho e me visto;" +
                "\n►Tomo café da manhã;",
                modifier = modifier
    )
    Text(
        text= "►Escovo os dentes;" +
                "\n►Fico pronto e saiu de casa as 6:20;" +
                "\n►Vou para a Univercidade",
                modifier = modifier
    )
    Text(
        text= "►Fico lá das 7:30 às 12:50;" +
                "\n►Quando acaba as aulas volto para a casa;" +
                "\n►chego lá para as <b>14:30;",
    )
    Text(
        text= "►Alomoçar;" +
                "\n►Às 15hrs eu começo a trabalhar;" +
                "\n►Largo as 20hrs;" +
                "\n►Vou malhar depois do expediente;" +
                "\n►Chego em casa às 22hrs;" +
                "\n►Tomo um banho e janto;" +
                "\n►Vou dormir;",
    )
    Image(
        painter = painterResource(id = R.drawable.minhamelhorfoto) ,
        contentDescription = null,
    )

}
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}