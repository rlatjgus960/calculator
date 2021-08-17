package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView result;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDiv;
    private Button btnMul;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnCe;
    private Button btnEq;

    //일반 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {

            String str = "";

            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "클릭이벤트 작동");
                Log.d("javaStudy", ""+view.getId());

                switch (view.getId()) {

                    case R.id.btn0:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn0);
                        str += btn0.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn1:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn1);
                        str += btn1.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn2:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn2);
                        str += btn2.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn3:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn3);
                        str += btn3.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn4:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn4);
                        str += btn4.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn5:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn5);
                        str += btn5.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn6:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn6);
                        str += btn6.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn7:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn7);
                        str += btn7.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn8:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn8);
                        str += btn8.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btn9:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btn9);
                        str += btn9.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnMul:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnMul);
                        str += btnMul.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnDiv:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnDiv);
                        str += btnDiv.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnPlus:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnPlus);
                        str += btnPlus.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnMinus:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnMinus);
                        str += btnMinus.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnCe:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnCe);
                        str += btnCe.getText().toString();
                        str = "";
                        result.setText(str);
                        break;

                    case R.id.btnEq:
                        Log.d("javaStudy", "btn0 버튼 클릭"+R.id.btnEq);

                        int cal = 0;

                        if(str.contains("+")) {
                            String[] spl = str.split("\\+");
                            cal = Integer.parseInt(spl[0]) + Integer.parseInt(spl[1]);
                        }else if(str.contains("-")) {
                            String[] spl = str.split("-");
                            cal = Integer.parseInt(spl[0]) - Integer.parseInt(spl[1]);
                        }else if(str.contains("*")) {
                            String[] spl = str.split("\\*");
                            cal = Integer.parseInt(spl[0]) * Integer.parseInt(spl[1]);
                        }else if(str.contains("/")) {
                            String[] spl = str.split("/");
                            cal = Integer.parseInt(spl[0]) / Integer.parseInt(spl[1]);
                        }

                        str += btnEq.getText().toString() + cal;

                        result.setText(str);

                        break;

                }
            }
        };













        result = (TextView) findViewById(R.id.result);


        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(listener);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(listener);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(listener);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(listener);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(listener);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(listener);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(listener);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(listener);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(listener);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(listener);

        btnMul = (Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(listener);

        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(listener);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(listener);

        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(listener);

        btnCe = (Button) findViewById(R.id.btnCe);
        btnCe.setOnClickListener(listener);

        btnEq = (Button) findViewById(R.id.btnEq);
        btnEq.setOnClickListener(listener);
    }
}