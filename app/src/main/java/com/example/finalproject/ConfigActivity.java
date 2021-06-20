package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class ConfigActivity extends AppCompatActivity {

    private final String TAG = "ConfigActivity";

    EditText resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        Intent intent = getIntent();
        float finalresult = intent.getFloatExtra("finalresult",0);


        Log.i(TAG, "onCreate:finalresult" + finalresult);

        resultText = (EditText)findViewById(R.id.fp_result);

        //显示数据到控件
        //resultText.setText(String.valueOf(finalresult));

        Log.i(TAG, "save: ");

        //获取新的值
        float fr = Float.parseFloat(resultText.getText().toString());

        Log.i(TAG, "save: 获取到新的值");
        Log.i(TAG, "save: finalresult" + finalresult);

        //保存到Bundle或放入到Extra
        Bundle bdl = new Bundle();
        bdl.putFloat("finalresult",finalresult);
        intent.putExtras(bdl);
        setResult(2,intent);

        //返回到调用页面
        finish();

    }
}