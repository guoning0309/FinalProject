package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,Runnable {

    private static final String TAG = "MainActivity";
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button dot;
    Button equ;
    Button clear;
    EditText result;
    EditText finalResult;

    double num1 = 0, num2 = 0;
    double Result = 0;
    int op = 0;
    String opd = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent conf = getIntent();
        float result = conf.getFloatExtra("thefinalresult", 100f);


        Log.i(TAG, "onCreate: result=" + result);


        finalResult = findViewById(R.id.fp_result);

        finalResult.setText(String.valueOf(result));


        // 获取页面上的控件
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        equ = findViewById(R.id.btn_equ);
        dot = findViewById(R.id.btn_dot);
        clear = findViewById(R.id.btn_clear);
        finalResult = (EditText) findViewById(R.id.fp_result);

        Button btn0 = (Button) findViewById(R.id.btn_0);
        Button btn1 = (Button) findViewById(R.id.btn_1);
        Button btn2 = (Button) findViewById(R.id.btn_2);
        Button btn3 = (Button) findViewById(R.id.btn_3);
        Button btn4 = (Button) findViewById(R.id.btn_4);
        Button btn5 = (Button) findViewById(R.id.btn_5);
        Button btn6 = (Button) findViewById(R.id.btn_6);
        Button btn7 = (Button) findViewById(R.id.btn_7);
        Button btn8 = (Button) findViewById(R.id.btn_8);
        Button btn9 = (Button) findViewById(R.id.btn_9);
        Button add = (Button) findViewById(R.id.btn_add);
        Button sub = (Button) findViewById(R.id.btn_sub);
        Button mul = (Button) findViewById(R.id.btn_mul);
        Button div = (Button) findViewById(R.id.btn_div);
        Button equ = (Button) findViewById(R.id.btn_equ);
        Button dot = (Button) findViewById(R.id.btn_dot);
        Button clear = (Button) findViewById(R.id.btn_clear);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equ.setOnClickListener(this);
        dot.setOnClickListener(this);
        clear.setOnClickListener(this);


        //按钮的单击事件
        btn1.setOnClickListener(new Click());
        btn2.setOnClickListener(new Click());
        btn3.setOnClickListener(new Click());
        btn4.setOnClickListener(new Click());
        btn5.setOnClickListener(new Click());
        btn6.setOnClickListener(new Click());
        btn7.setOnClickListener(new Click());
        btn8.setOnClickListener(new Click());
        btn9.setOnClickListener(new Click());
        btn0.setOnClickListener(new Click());
        add.setOnClickListener(new Click());
        sub.setOnClickListener(new Click());
        mul.setOnClickListener(new Click());
        div.setOnClickListener(new Click());
        equ.setOnClickListener(new Click());
        dot.setOnClickListener(new Click());
        clear.setOnClickListener(new Click());

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void run() {
        Thread t = new Thread(this);//创建新线程
        t.start();//开启线程

        Log.i("thread","run.....");
        boolean marker = false;
        List<HashMap<String,String>> resultList = new ArrayList<HashMap<String ,String>>();


    }


    // 设置按钮点击后的监听
    class Click implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {                //switch循环获取点击按钮后的值
                case R.id.btn_0:
                    String str = result.getText().toString();
                    str += "0";
                    result.setText(str);
                    break;
                case R.id.btn_1:
                    String str1 = result.getText().toString();
                    str1 += "1";
                    result.setText(str1);
                    break;
                case R.id.btn_2:
                    String str2 = result.getText().toString();
                    str2 += "2";
                    result.setText(str2);
                    break;
                case R.id.btn_3:
                    String str3 = result.getText().toString();
                    str3 += "3";
                    result.setText(str3);
                    break;
                case R.id.btn_4:
                    String str4 = result.getText().toString();
                    str4 += "4";
                    result.setText(str4);
                    break;
                case R.id.btn_5:
                    String str5 = result.getText().toString();
                    str5 += "5";
                    result.setText(str5);
                    break;
                case R.id.btn_6:
                    String str6 = result.getText().toString();
                    str6 += "6";
                    result.setText(str6);
                    break;
                case R.id.btn_7:
                    String str7 = result.getText().toString();
                    str7 += "7";
                    result.setText(str7);
                    break;
                case R.id.btn_8:
                    String str8 = result.getText().toString();
                    str8 += "8";
                    result.setText(str8);
                    break;
                case R.id.btn_9:
                    String str9 = result.getText().toString();
                    str9 += "9";
                    result.setText(str9);
                    break;
                case R.id.btn_dot:
                    String strDot = result.getText().toString();
                    strDot += ".";
                    result.setText(strDot);
                    break;
                case R.id.btn_add:             //判断，使用加减乘除的操作符
                    String strAdd = result.getText().toString();
                    if (strAdd.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(strAdd);
                    result.setText(null);
                    op = 1;
                    opd = "+";
                    break;
                case R.id.btn_sub:
                    String strSub = result.getText().toString();
                    if (strSub.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(strSub);
                    result.setText(null);
                    op = 2;
                    opd = "-";
                    break;
                case R.id.btn_mul:
                    String strMul = result.getText().toString();
                    if (strMul.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(strMul);
                    result.setText(null);
                    op = 3;
                    opd = "×";
                    break;
                case R.id.btn_div:
                    String strDiv = result.getText().toString();
                    if (strDiv.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(strDiv);
                    result.setText(null);
                    op = 4;
                    opd = "÷";
                    break;
                case R.id.btn_clear:                 //编辑框文本显示为空
                    result.setText(null);
                    break;
                case R.id.btn_equ:                   //计算，以操作符为判断，选择所需的运算，并将结果输出
                    String strEqu = result.getText().toString();
                    if (strEqu.equals(null)) {
                        return;
                    }
                    num2 = Double.valueOf(strEqu);
                    result.setText(null);
                    switch (op) {
                        case 0:
                            Result = num2;
                            break;
                        case 1:
                            Result = num1 + num2;
                            break;
                        case 2:
                            Result = num1 - num2;
                            break;
                        case 3:
                            Result = num1 * num2;
                            break;
                        case 4:
                            if (num2 == 0)                //除法中分子与分母之分
                                Result = 0;
                            else
                                Result = num1 / num2;
                            break;
                        default:
                            Result = 0;
                            break;
                    }
                    result.setText(Double.toString(num1) + opd + Double.toString(num2) + "=" + Double.toString(Result));    //将结果完整输出
                    break;
                default:
                    break;
            }
        }
    }


    public void openOne(View btn) {
        Intent config = new Intent(this, ConfigActivity.class);
        config.putExtra("fp_result", Result);

        Log.i(TAG, "openOne:finalResult" + finalResult);

        //startActivity(config);
        startActivityForResult(config, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == 2) {

            Bundle bundle = data.getExtras();
            Result = bundle.getFloat("finalresult", 0);
            Log.i(TAG, "onActivityResult: finalresult=" + finalResult);


            Log.i(TAG, "onActivityResult: 数据已保存到sharedPreferences");


            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
