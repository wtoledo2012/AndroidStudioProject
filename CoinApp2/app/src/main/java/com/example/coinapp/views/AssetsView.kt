package com.example.coinapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.coinapp.models.Asset

@Composable
fun AssetRow(asset: Asset) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        /*Icon(
            imageVector = Icons.Filled.CheckCircle,
            contentDescription = null,
            tint = Color.Red,
            modifier = Modifier.padding(horizontal = 8.dp)
        )*/
        AsyncImage(
            model="https://assets.coincap.io/assets/icons/${asset.symbol.lowercase()}@2x.png",
            contentDescription = null
        )

        Column {
            Text(text = asset.symbol,fontSize = 18.sp)
            Text(text = asset.name,fontSize = 14.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
        /*Icon(
            imageVector = Icons.Filled.KeyboardArrowUp,
            contentDescription = null,
            tint = Color.Green,
            modifier = Modifier.padding(horizontal = 16.dp)
        )*/

        Text(
            text = "${asset.percentage}%",
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp),
            color = if(asset.percentage >= 0) Color.Green else Color.Red
        )

        Text(
            text = "$${asset.price}",
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Preview(
    showBackground = true
    //showSystemUi = true
)
@Composable
fun AssetRowPreview() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        AssetRow(Asset(id="1", name = "Bitcon", percentage = 5.35, symbol = "BTC",price = "83000"))
        Spacer(modifier = Modifier.size(16.dp))
        AssetRow(Asset(id="2", name = "Ethereum", percentage = -1.35, symbol = "ETH",price = "1280"))
        /*Spacer(modifier = Modifier.size(16.dp))
        AssetRow()*/
    }
}