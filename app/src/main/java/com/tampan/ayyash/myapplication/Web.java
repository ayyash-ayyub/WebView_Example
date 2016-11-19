package com.tampan.ayyash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    private WebView w;

    String url ="http://192.168.50.254/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        w = (WebView)findViewById(R.id.webNya);
        w.setWebViewClient(new MyBrowser());


        w.getSettings().setLoadsImagesAutomatically(true);
        w.getSettings().setJavaScriptEnabled(true);
        w.setScrollBarStyle(w.SCROLLBARS_INSIDE_OVERLAY);
        w.loadUrl(url);


    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
