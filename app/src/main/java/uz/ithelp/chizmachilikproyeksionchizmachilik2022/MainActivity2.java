package uz.ithelp.chizmachilikproyeksionchizmachilik2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        webView1 = findViewById(R.id.webView1);


        webView1.setWebViewClient(new WebViewClient());
        webView1.getSettings().setSupportZoom(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl( "https://docs.google.com/gview?embedded=true&url=" + getIntent().getStringExtra("data"));


    }
}