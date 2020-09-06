package com.sujith.mylibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings.LOAD_CACHE_ELSE_NETWORK
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_chat.*

class ChatDialog : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, android.R.style.Theme_Holo_Light);
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chatWebView.apply {
            settings.javaScriptEnabled = true
            settings.useWideViewPort = true
            settings.loadWithOverviewMode = true
            settings.domStorageEnabled = true
            settings.cacheMode = LOAD_CACHE_ELSE_NETWORK
            settings.loadsImagesAutomatically = true
            settings.domStorageEnabled = true
            settings.useWideViewPort = true
            settings.setAppCacheEnabled(true)
            loadUrl("https://chats.landbot.io/v2/H-698159-96JWRD7RPM27F86R/index.html")
        }
        closeChatDialog.setOnClickListener {
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()

    }
}