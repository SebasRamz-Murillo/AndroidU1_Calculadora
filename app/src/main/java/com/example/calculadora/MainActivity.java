package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, mas, menos, por,entre, borraT, borra, igual, punto;
    TextView operador, operacion, result;
    String valor;
    Float v1, v2, resultado;
    int opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textviews
        operador=  (TextView) findViewById(R.id.operador);
        operacion=  (TextView) findViewById(R.id.operacion);
        result=  (TextView) findViewById(R.id.result);
        //botones
        cero= (Button) findViewById(R.id.cero);// cero
        uno= (Button) findViewById(R.id.uno);
        dos= (Button) findViewById(R.id.dos);
        tres= (Button) findViewById(R.id.tres);
        cuatro= (Button) findViewById(R.id.cuatro);
        cinco= (Button) findViewById(R.id.cinco);
        seis= (Button) findViewById(R.id.seis);
        siete= (Button) findViewById(R.id.siete);
        ocho= (Button) findViewById(R.id.ocho);
        nueve= (Button) findViewById(R.id.nueve); // nueve
        punto =(Button) findViewById(R.id.punto);
        //operadores
        mas =(Button) findViewById(R.id.mas);
        menos =(Button) findViewById(R.id.menos);
        por =(Button) findViewById(R.id.por);
        entre =(Button) findViewById(R.id.entre);
        //finalizadores
        borraT =(Button) findViewById(R.id.borratodo);
        borra =(Button) findViewById(R.id.borra);
        igual =(Button) findViewById(R.id.igual);


        cero.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        //operaciones
        mas .setOnClickListener(this);
        menos .setOnClickListener(this);
        por.setOnClickListener(this);
        entre .setOnClickListener(this);
        //extras
        borraT.setOnClickListener(this);
        borra.setOnClickListener(this);
        punto.setOnClickListener(this);

        igual.setOnClickListener(this);
    }

    public void operador1(View v){
        switch (v.getId() ){
            case  R.id.cero:
                if (valor=="0" || valor==null){

                    break;
                } else {
                    valor = valor + "0";
                }
                break;
            case  R.id.uno:
                if (valor==null || valor=="0"){
                    valor="1";
                } else {
                    valor = valor + "1";
                }
                break;
            case  R.id.dos:
                if (valor==null || valor=="0"){
                    valor="2";
                } else {
                    valor = valor + "2";
                }
                break;
            case  R.id.tres:
                if (valor==null || valor=="0"){
                    valor="3";
                } else {
                    valor = valor + "3";
                }
                break;
            case  R.id.cuatro:
                if (valor==null || valor=="0"){
                    valor="4";
                } else {
                    valor = valor + "4";
                }
                break;
            case  R.id.cinco:
                if (valor==null || valor=="0"){
                    valor="5";
                } else {
                    valor = valor + "5";
                }
                break;
            case  R.id.seis:
                if (valor==null || valor=="0"){
                    valor="6";
                } else {
                    valor = valor + "6";
                }
                break;
            case  R.id.siete:
                if (valor==null || valor=="0"){
                    valor="7";
                } else {
                    valor = valor + "7";
                }
                break;
            case  R.id.ocho:
                if (valor==null || valor=="0"){
                    valor="8";
                } else {
                    valor = valor + "8";
                }
                break;
            case  R.id.nueve:
                if (valor==null || valor=="0"){
                    valor="9";
                } else {
                    valor = valor + "9";
                }
                break;
            case  R.id.punto:
                if (valor==null || valor=="0"){
                    valor="0.";
                } else {
                    valor = valor + ".";
                }
        }

        operador.setText(valor);
    }

    public void borraTodo(View v){
        if(v.getId()==R.id.borratodo) {
            valor="0";
            operador.setText(valor);
        }
    }
    public void borraUltimo(View v){
        if(v.getId()==R.id.borra) {
            if(valor!="0"){
                valor = valor.substring(0, valor.length()-1);
                if(valor.length()==0){
                    valor="0";
                }
                operador.setText(valor);
            }

        }
    }

    public void paso1(View v){
        switch (v.getId() ){
            case  R.id.mas:
                if(v1==null){
                    v1=Float.parseFloat(valor);
                    opcion=1;
                    operacion.setText(valor+"+");
                    valor="0";
                    operador.setText(valor);
                } else{
                    if(v2==null){
                        v2=Float.parseFloat(valor);
                        resultado=v1+v2;
                        result.setText(resultado.toString());
                        operacion.setText(v1+"+"+v2);
                        valor="0";
                        operador.setText(valor);
                    }

                }

                break;
            case  R.id.menos:
                v1=Float.parseFloat(valor);
                opcion=2;
                operacion.setText(valor+"-");
                valor="0";
                break;
            case  R.id.por:
                v1=Float.parseFloat(valor);
                operacion.setText(valor+"*");
                opcion=3;
                valor="0";
                break;
            case  R.id.entre:
                v1=Float.parseFloat(valor);
                operacion.setText(valor+"/");
                opcion=4;
                valor="0";
                break;
        }
    }

    public void resolver(View v){

    }

    @Override
    public void onClick(View view) {
        operador1(view);
        borraTodo(view);
        borraUltimo(view);
        paso1(view);
        resolver(view);
    }
}