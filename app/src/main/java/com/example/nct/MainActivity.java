package com.example.nct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView view1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1=(WebView)findViewById(R.id.view);
        WebSettings websetting=view1.getSettings();
        websetting.setJavaScriptEnabled(true);

        view1.setWebViewClient(new WebViewClient());
        view1.loadUrl("file:///android_asset/index.html");
    }
}
