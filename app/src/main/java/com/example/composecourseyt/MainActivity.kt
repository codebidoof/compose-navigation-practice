package com.example.composecourseyt

import android.accessibilityservice.GestureDescription
import android.annotation.SuppressLint
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    @SuppressLint("InvalidColorHexValue")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //xml은 setContentView

        setContent {
            Navigation()
        }
    }
}

//@SuppressLint("UnrememberedMutableState")
//@Composable
//fun ColorBox(modifier: Modifier = Modifier,
//             updateColor: (Color) -> Unit //실행문
//) {
//
//    Box(modifier = modifier
//        .background(Color.Red)
//        .clickable{
//            updateColor(
//                Color(
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//                    1f
//                )
//            )
//
//        })
//}
//
//
//
//
////카드뷰만들기
//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = CardDefaults.cardElevation(5.dp)
//    ) {
//        Box(modifier = Modifier.height(200.dp)) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize()
//
//            )
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.verticalGradient(
//                        colors = listOf(
//                            Color.Transparent,
//                            Color.Black
//                        ),
//                        startY = 300f
//                    )
//                ))
//
//            // 이 Box는 Image 위에 overlay 용으로 둔 것 같음
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                contentAlignment = Alignment.BottomStart
//            ) {
//                // 여기에 title Text나 다른 overlay 요소 넣기
//                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//            }
//        }
//    }
//}