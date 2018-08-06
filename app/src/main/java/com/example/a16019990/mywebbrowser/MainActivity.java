package com.example.a16019990.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView wvWebPage;
    Button btnLoadURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvWebPage = findViewById(R.id.webview);
        btnLoadURL = findViewById(R.id.button);

        wvWebPage.getSettings().setJavaScriptEnabled(true);
        wvWebPage.getSettings().setAllowFileAccess(false);
        wvWebPage.getSettings().setBuiltInZoomControls(true);
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.grab.com.sg";
                wvWebPage.loadUrl(url);
            }
        });
    }
}
