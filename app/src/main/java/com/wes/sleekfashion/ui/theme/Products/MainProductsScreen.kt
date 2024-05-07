package com.wes.sleekfashion.ui.theme.Products

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wes.sleekfashion.R
import com.wes.sleekfashion.navigation.ROUTE_LOGIN
import com.wes.sleekfashion.navigation.ROUTE_REGISTER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductScreen(navController: NavController){
    Column (

        modifier = Modifier.fillMaxSize(),

        ){
        Navbar()
        Box (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.beach),
                contentDescription = "Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }


    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar(){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Sleek Fashion") },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context,"Welcome to the HomeScreen", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {

            IconButton(onClick = { Toast.makeText(context,"You can now share", Toast.LENGTH_SHORT) .show()}) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "share", tint = Color.White)
            }
            IconButton(onClick = { Toast.makeText(context,"This is the menu Icon", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Menu", tint = Color.White)
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "PERSON", tint = Color.White )
            }
        })
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun  ProductScreenPreview(){
    ProductScreen(rememberNavController())
}