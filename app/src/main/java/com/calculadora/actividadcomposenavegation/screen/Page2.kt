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
import androidx.compose.ui.graphics.Color
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
        R.drawable.agro,
        R.drawable.farmhouse,
        R.drawable.agricultura,
        R.drawable.granja,
        R.drawable.farmhouse,
        R.drawable.agro,
        R.drawable.agricultura,
        R.drawable.farmhouse,
        R.drawable.granja,
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
                            .width(250.dp)
                            .height(230.dp)
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
            Triple("El agro es de suma importancia por varias razones. En primer lugar, " +
                    "asegura la seguridad alimentaria, proporcionando un suministro adecuado " +
                    "de alimentos para la población mundial. En términos económicos, el sector " +
                    "agrícola es un pilar en muchos países, generando empleo e ingresos a través " +
                    "de la exportación de productos agrícolas.", R.drawable.granja, "Además, " +
                    "la agricultura y la ganadería tienen un impacto significativo en el medio " +
                    "ambiente, y las prácticas sostenibles son esenciales para minimizar la " +
                    "degradación del suelo, la deforestación, la contaminación del agua y la " +
                    "pérdida de biodiversidad."),
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
                    Text(text = block.first, color = Color.White,
                        modifier = Modifier.padding(bottom = 8.dp).padding(16.dp))
                    Image(
                        painter = painterResource(id = block.second),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(text = block.third, color = Color.White,
                        modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}