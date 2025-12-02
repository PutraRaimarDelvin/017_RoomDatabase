package com.example.pertemuan9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pertemuan9.ui.theme.Pertemuan9Theme
import com.example.pertemuan9.view.uicontroller.SiswaApp   // <--- penting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Pertemuan9Theme {
                SiswaApp()   // <--- ini harusnya yang dipanggil
            }
        }
    }
}
