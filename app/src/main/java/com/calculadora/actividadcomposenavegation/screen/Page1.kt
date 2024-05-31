package com.calculadora.actividadcomposenavegation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.calculadora.actividadcomposenavegation.R
import com.calculadora.actividadcomposenavegation.ui.theme.GrisV

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal_actividad(navegationController: NavHostController){
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxWidth().width(400.dp)) { page ->
            when (page) {
                0 -> Content1()
                1 -> Content2()
                2 -> Page_1(navegationController)
            }
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(1f),
            horizontalArrangement = Arrangement.Center) {
            repeat(pagerState.pageCount){
                var color = if (pagerState.currentPage == it) Color.Black else Color.Gray
                Box(modifier = Modifier.padding(5.dp).background(color)){

                }
            }
        }
    }
}



@Composable
fun Main(navegationController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFFFFF))) {
        horizontal_actividad(navegationController)
    }
}

@Composable
fun Content1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(GrisV),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Filas1(img = R.drawable.farmhouse, Descript = "#####")

        Row(modifier = Modifier) {
            Text(
                text = "Bienvenido a AGRO!",
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 30.sp

            )

        }

        Row(modifier = Modifier.padding(30.dp)) {
            Text(
                text = "El sector agropecuario colombiano está compuesto por las actividades " +
                        "de producción primaria en los ámbitos agrícola, pecuario, forestal, " +
                        "pesquero y acuícola.",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                color = Color.White,
            )
        }
    }
}

@Composable
fun Content2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(GrisV),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Filas2(img = R.drawable.agro, Descript = "#####")

        Row(modifier = Modifier) {
            Text(
                text = "Introducción al Agro",
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 30.sp

            )

        }

        Row(modifier = Modifier.padding(30.dp)) {
            Text(
                text = "El agro, término que deriva de agricultura, abarca una amplia gama de " +
                        "actividades relacionadas con el cultivo de plantas y la cría de animales " +
                        "para producir alimentos, fibras, medicinas y otros productos necesarios " +
                        "para sostener y mejorar la vida humana.",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                color = Color.White,
            )
        }
    }
}

@Composable
fun Page_1(navegationController: NavHostController){
    Box(
        modifier= Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(GrisV),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            Filas3(img = R.drawable.agricultura, Descript = "#####")

            Row(modifier = Modifier) {
                Text(
                    text = "Agricultura",
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp

                )

            }

            Row(modifier = Modifier.padding(30.dp)) {
                Text(
                    text = "La agricultura es una de las áreas principales del agro e involucra la " +
                            "siembra, cultivo y cosecha de plantas. Los principales tipos de " +
                            "agricultura incluyen la agricultura de secano, que depende únicamente " +
                            "del agua de lluvia; la agricultura de regadío, que utiliza sistemas de " +
                            "riego para suplementar el agua de lluvia; la horticultura, que se " +
                            "dedica al cultivo de plantas en jardines y huertos; y la silvicultura, " +
                            "que implica el cultivo y manejo de bosques.",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    color = Color.White,
                )
            }

            Button(onClick={navegationController.navigate("view_2")}) {
                Text(text = "Importancia del Agro")
            }
        }
    }
}

@Composable
fun Filas1(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(500.dp)
                .height(500.dp)
        )
    }
}

@Composable
fun Filas2(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(400.dp)
                .height(400.dp)
        )
    }
}

@Composable
fun Filas3(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(300.dp)
                .height(300.dp)
        )
    }
}





