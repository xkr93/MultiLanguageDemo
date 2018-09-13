package com.shushangyun.multilanguagedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG","main = "+MultiLanguageUtil.getInstance().getLanguageType());
        MultiLanguageUtil.getInstance().setConfiguration(this);
        setContentView(R.layout.activity_main);
        tv_select = findViewById(R.id.tv_select);
        tv_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LanguageSelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
