package com.example.coinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.util.Preconditions
import com.example.coinapp.models.Asset
import com.example.coinapp.ui.theme.CoinAppTheme
import com.example.coinapp.views.AssetRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    )
                    {
                        AssetRow(Asset(id="1", name = "Bitcon", percentage = 5.35, symbol = "BTC",price = "83000"))
                        Spacer(modifier = Modifier.size(16.dp))
                        AssetRow(Asset(id="2", name = "Ethereum", percentage = -1.35, symbol = "ETH",price = "1280"))
                    }
                }
            }
        }
    }
}