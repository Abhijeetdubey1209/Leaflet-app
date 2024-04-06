package com.example.leaflet

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.allViews
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity2 : AppCompatActivity() {
    private lateinit var webView: WebView



    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://65db7176fd5529f174ec9a38--kaleidoscopic-chaja-b42835.netlify.app/")
        webView.webViewClient = object : WebViewClient(){}


    }



    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack()
        }
        else{
            super.onBackPressed()}
    }
}