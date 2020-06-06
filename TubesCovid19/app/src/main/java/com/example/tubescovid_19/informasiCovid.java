package com.example.tubescovid_19;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class informasiCovid extends AppCompatActivity {
    WebView mWebView;
    WebSettings mWebSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_covid);

        mWebView = (WebView)findViewById(R.id.webview1);
        mWebSetting = mWebView.getSettings();
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.itera.ac.id/");
    }
}
