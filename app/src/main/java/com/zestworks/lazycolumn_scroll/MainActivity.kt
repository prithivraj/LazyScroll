package com.zestworks.lazycolumn_scroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zestworks.lazycolumn_scroll.ui.theme.LazyScrollTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyScrollTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(30) {
                            Greeting(UUID.randomUUID().toString())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyScrollTheme {
        Greeting("Android")
    }
}