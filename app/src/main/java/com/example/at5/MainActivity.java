package com.example.at5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void criar(View v){
        int totalCampo=0;
        Date dataAtual = new Date();
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.setTime(dataAtual);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        LinearLayout layout= (LinearLayout) findViewById(R.id.linearLayout);
        LinearLayout.LayoutParams p= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        layout.removeAllViews();
        totalCampo=0;
        if(hora>=9 && hora<11){
            totalCampo=1;
        }else if(hora>=11 && hora<13){
            totalCampo=3;
        }else if(hora>=13 && hora<17){
            totalCampo=4;
        }else if(hora>=17 && hora<=23){
            totalCampo=8;
        }else if(hora>23){
            totalCampo=0;
        }

        for(int i=0; i<totalCampo;i++){
            EditText texto = new EditText(this);
            texto.setLayoutParams(p);
            texto.setTextSize(15f);
            texto.setPadding(2,8,2,2);

            layout.addView(texto);
        }
    }

}