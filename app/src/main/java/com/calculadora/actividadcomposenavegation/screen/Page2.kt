package com.calculadora.actividadcomposenavegation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.calculadora.actividadcomposenavegation.R
import com.calculadora.actividadcomposenavegation.ui.theme.GrisV

@Composable
fun Page_2(navegationController: NavHostController){
    Box(modifier = Modifier.fillMaxSize()){
        SimpleLazyColumn()
    }
}

@Composable
fun SimpleLazyRow() {
    val images = listOf(
        R.drawable.avion,
        R.drawable.farmhouse,
        R.drawable.globo,
        R.drawable.avion,
        R.drawable.farmhouse,
        R.drawable.globo,
        R.drawable.avion,
        R.drawable.farmhouse,
        R.drawable.globo,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(GrisV),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Row {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(images) { image ->
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(10.dp)
                            .width(80.dp)
                            .height(80.dp)
                    )
                }
            }
        }
        Row {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(images) { image ->
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(10.dp)
                            .width(300.dp)
                            .height(320.dp)
                    )
                }
            }

        }
    }
}

@Composable
fun SimpleLazyColumn(){

    Row {
        val blocks = listOf(
            Triple("Preparar el terreno, realizar operaciones de siembra, trasplante y plantación " +
                    "supervisando la correcta realización de las mismas, y teniendo en cuenta la " +
                    "naturaleza del suelo y los requerimientos de las especies, para obtener cultivos " +
                    "bien desarrollados y sanos.", R.drawable.avion, "Un producto agrícola o " +
                    "cultivo son plantas que se pueden cultivar y cosechar extensivamente con fines de " +
                    "lucro o de subsistencia. Los productos agrícolas pueden referirse a las partes " +
                    "cosechadas o a la cosecha en un estado más refinado."),
        )

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(blocks) { block ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .background(GrisV),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    SimpleLazyRow()
                    Text(text = block.first, modifier = Modifier.padding(bottom = 8.dp))
                    Image(
                        painter = painterResource(id = block.second),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(text = block.third)
                }
            }
        }
    }
}

