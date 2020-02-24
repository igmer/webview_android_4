package com.example.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SuperiorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superior);
        WebView webview = findViewById(R.id.webview);
        WebSettings webSetting = webview.getSettings();
        String MyUA = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";
        webSetting.setUserAgentString(MyUA);
        webSetting.setJavaScriptEnabled(true);
        webSetting.setDomStorageEnabled(true);

        webview.loadUrl("file:///android_asset/index.html");

    }
}
