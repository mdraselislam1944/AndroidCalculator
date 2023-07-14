package com.example.classtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDel,btnAC,btnPer,btnPlus,btnMinus,btnMul,btnDiv,btnDot,btnEqual;
    private EditText text1;
    private boolean add,sub,mul,div;
    float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText) findViewById(R.id.edtName);
        btn0=(Button)findViewById(R.id.btnZero);
        btn1=(Button)findViewById(R.id.btnOne);
        btn2=(Button)findViewById(R.id.btnTwo);
        btn3=(Button)findViewById(R.id.btnThree);
        btn4=(Button)findViewById(R.id.btnFour);
        btn5=(Button)findViewById(R.id.btnFive);
        btn6=(Button)findViewById(R.id.btnSix);
        btn7=(Button)findViewById(R.id.btnSeven);
        btn8=(Button)findViewById(R.id.btnEight);
        btn9=(Button)findViewById(R.id.btnNine);
        btnDel=(Button)findViewById(R.id.btnDel);
        btnPer=(Button)findViewById(R.id.btnPercent);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnAC=(Button)findViewById(R.id.btnAC);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDivide);
        btnDot=(Button)findViewById(R.id.btnPoint);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               text1.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "0";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "1";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "2";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "3";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "4";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "5";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "6";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "7";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "8";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "9";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "+";
                String newText = existingText + additionalText;
                text1.setText(newText);
                a=Float.parseFloat(existingText);
                add=true;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "-";
                String newText = existingText + additionalText;
                text1.setText(newText);
                a=Float.parseFloat(existingText);
                sub=true;
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "*";
                String newText = existingText + additionalText;
                text1.setText(newText);
                a=Float.parseFloat(existingText);
                mul=true;
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = "/";
                String newText = existingText + additionalText;
                text1.setText(newText);
                a=Float.parseFloat(existingText);
                div=true;
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String additionalText = ".";
                String newText = existingText + additionalText;
                text1.setText(newText);
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                float per=(Float.parseFloat(existingText))*100;
                text1.setText(Float.toString(per));
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String existingText = text1.getText().toString();
                String result = existingText.substring(0, existingText.length() - 1);
                text1.setText(result);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add==true){
                    String existingText = text1.getText().toString();
                    int plusIndex = existingText.indexOf("+");

                    String valueAfterPlus = existingText.substring(plusIndex + 1).trim();
                     b = Float.parseFloat(valueAfterPlus);

                    float p=a+b;
                    text1.setText(Float.toString(p));
                    add=false;
                }
                else if(sub==true){
                    String existingText = text1.getText().toString();
                    int plusIndex = existingText.indexOf("-");

                    String valueAfterPlus = existingText.substring(plusIndex + 1).trim();
                     b = Float.parseFloat(valueAfterPlus);

                    float p=a-b;
                    text1.setText(Float.toString(p));
                    sub=false;
                }
                else if(mul==true){
                    String existingText = text1.getText().toString();
                    int plusIndex = existingText.indexOf("*");

                    String valueAfterPlus = existingText.substring(plusIndex + 1).trim();
                     b = Float.parseFloat(valueAfterPlus);

                    float p=a*b;
                    text1.setText(Float.toString(p));
                    mul=false;
                }
               else if (div) {
                    String existingText = text1.getText().toString();
                    int divIndex = existingText.indexOf("/");

                    String valueAfterDiv = existingText.substring(divIndex + 1).trim();
                     b = Float.parseFloat(valueAfterDiv);

                    if (b == 0) {
                        text1.setText("Error: Cannot divide by zero");
                    } else {
                        float p = (float) a / b;
                        text1.setText(Float.toString(p));
                    }
                    div = false;
                }
               a=0;
            }
        });
    }
}