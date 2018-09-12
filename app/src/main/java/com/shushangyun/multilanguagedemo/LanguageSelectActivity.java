package com.shushangyun.multilanguagedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-09-12.
 */

public class LanguageSelectActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_auto,tv_rcn,tv_rhk,tv_en;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);
        tv_auto = findViewById(R.id.tv_auto);
        tv_rcn = findViewById(R.id.tv_rcn);
        tv_rhk = findViewById(R.id.tv_rhk);
        tv_en = findViewById(R.id.tv_en);
        tv_auto.setOnClickListener(this);
        tv_rcn.setOnClickListener(this);
        tv_rhk.setOnClickListener(this);
        tv_en.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int selectedLanguage = 0;
        switch (view.getId()){
            case R.id.tv_auto:
                selectedLanguage = LanguageType.LANGUAGE_FOLLOW_SYSTEM;
                break;
            case R.id.tv_rcn:
                selectedLanguage = LanguageType.LANGUAGE_CHINESE_SIMPLIFIED;
                break;
            case R.id.tv_rhk:
                selectedLanguage = LanguageType.LANGUAGE_CHINESE_TRADITIONAL;
                break;
            case R.id.tv_en:
                selectedLanguage = LanguageType.LANGUAGE_EN;
                break;
        }
        MultiLanguageUtil.getInstance().updateLanguage(selectedLanguage);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
       finish();
    }
}
