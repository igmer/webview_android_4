package com.example.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XWalkView mXWalkView = (XWalkView) findViewById(R.id.activity_main);
        String MyUA = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";
        mXWalkView.setUserAgentString(MyUA);
        //XWalkSettings webSettings = mXWalkView.getSettings();

        mXWalkView.load("file:///android_asset/index.html", null);

    }
}
