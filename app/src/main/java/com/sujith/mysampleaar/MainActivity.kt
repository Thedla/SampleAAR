package com.sujith.mysampleaar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sujith.mylibrary.ChatDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*sampleWebView?.apply {
            settings.javaScriptEnabled = true
            settings.useWideViewPort = true
            settings.loadWithOverviewMode = true
            settings.domStorageEnabled = true
            loadUrl("file:///android_asset/html/ChatBot.html")
        }*/
        //sampleWebView.initView()
        chatButton.setOnClickListener {


            // The device is using a large layout, so show the fragment as a dialog
                ChatDialog().show(supportFragmentManager, "dialog")
        }
    }
}
