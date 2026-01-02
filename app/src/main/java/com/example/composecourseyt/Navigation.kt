package com.example.composecourseyt

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//네비게이션
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        //composable : 이 route로 들어오면, 이 화면을 그려라
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "/{name}",   //인자를 추가할때마다 /{...} 을 추가.
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType //전달받을 값의 자료형
                    defaultValue = "Phillip" //디폴트 전달값
                    nullable = true //nullable 허용
                }
            )
        ) { entry ->
            DetailScreen(name = entry.arguments?.getString("name")) //번들로 전달
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        TextField(value = text, onValueChange = { //(String) -> Unit
            text = it //newText -> text = newText
        },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        //중요!!!!!
        Button(onClick = {
            navController.navigate(Screen.DetailScreen.withArgs(text))

        },
            modifier = Modifier.align(Alignment.End)) {
            Text(text = "To DetailScreen")
        }

    }

}

@Composable
fun DetailScreen(name: String?) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Hello $name")
    }
}