package com.uninorte.actividad2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora1 extends AppCompatActivity implements View.OnClickListener {


    TextView Resultado;
    int a = 0;
    int e = 0;
    int c = 0;
    int d = 0;
    int f = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora1);
        Resultado = (TextView) findViewById(R.id.Resultado);
        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.b0:
                a = 0;
                Resultado.setText("0");
            case R.id.b1:
                a = 1;
                Resultado.setText("1");
            case R.id.b2:
                a = 2;
                Resultado.setText("2");
            case R.id.b3:
                a = 3;
                Resultado.setText("3");
            case R.id.b4:
                a = 4;
                Resultado.setText("4");
            case R.id.b5:
                a = 5;
                Resultado.setText("5");
            case R.id.b6:
                a = 6;
                Resultado.setText("6");
            case R.id.b7:
                a = 7;
                Resultado.setText("7");
            case R.id.b8:
                a = 8;
                Resultado.setText("8");
            case R.id.b9:
                a = 9;
                Resultado.setText("9");
            case R.id.bsuma:
                c = 1;
                e = a;
            case R.id.bresta:
                d = 1;
                f = a;
            case R.id.btotal:
                if (c == 1) {
                    int g = e + a;
                    String t = String.valueOf(g);
                    Resultado.setText(t);
                }
                if (d == 1) {
                    int g = f - a;
                    String t = String.valueOf(g);
                    Resultado.setText(t);
                }
        }

    }
}

