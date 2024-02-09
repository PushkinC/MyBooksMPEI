package com.example.pdfapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        var view = findViewById<PDFView>(R.id.View)
        view.fromAsset(intent.getStringExtra("path")).load()
    }
}