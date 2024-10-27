package com.example.pam5

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.nio.file.WatchEvent.Modifier


@Composable
fun layout(
    modifiar: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection()
    }
}

@Composable
fun HeaderSection(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    )
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxSize().background(color.lightGray)
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            image(painter = paintResource(id = R.drawable.umy),contenDesrciption = null )
        }
    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.lightGray)
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            Box(
                contentAligment = Aligment.BottomEnd
            ){
                image(painter = painterResource(id = R.drawable.umy), contenDescription = null,
                    modifer = Modifier.clip(CircleShappe))
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)

                )
            }
            Colum (
                modifier = Modifier.padding(14.dp)
            ){
                Text(text = "Teknologi Informasi")
                Text(text = )
            }
        }
    }
}