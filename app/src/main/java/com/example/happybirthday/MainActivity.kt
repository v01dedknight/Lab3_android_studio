package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeQuadrantScreen()
        }
    }
}

@Composable
fun ComposeQuadrantScreen() {

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        val halfWidth = maxWidth / 2
        val halfHeight = maxHeight / 2

        Column {

            Row {
                Quadrant(
                    title = stringResource(R.string.text_title),
                    description = stringResource(R.string.text_description),
                    color = Color(0xFFEADDFF),
                    modifier = Modifier.size(halfWidth, halfHeight)
                )

                Quadrant(
                    title = stringResource(R.string.image_title),
                    description = stringResource(R.string.image_description),
                    color = Color(0xFFD0BCFF),
                    modifier = Modifier.size(halfWidth, halfHeight)
                )
            }

            Row {
                Quadrant(
                    title = stringResource(R.string.row_title),
                    description = stringResource(R.string.row_description),
                    color = Color(0xFFB69DF8),
                    modifier = Modifier.size(halfWidth, halfHeight)
                )

                Quadrant(
                    title = stringResource(R.string.column_title),
                    description = stringResource(R.string.column_description),
                    color = Color(0xFFF6EDFF),
                    modifier = Modifier.size(halfWidth, halfHeight)
                )
            }
        }
    }
}

@Composable
fun Quadrant(
    title: String,
    description: String,
    color: Color,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}