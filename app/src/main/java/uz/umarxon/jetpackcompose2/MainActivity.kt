package uz.umarxon.jetpackcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.umarxon.jetpackcompose2.ui.theme.JetpackCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("CardView Example")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center){
        Card(name)
    }
}

@Composable
fun Card(name:String) {

    Card(
        shape = RoundedCornerShape(15.dp),
        backgroundColor = MaterialTheme.colors.primary,
    ) {
        Column(
            modifier = Modifier.height(200.dp).padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = name,
                style = MaterialTheme.typography.h4)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose2Theme {
        Greeting("Android")
    }
}