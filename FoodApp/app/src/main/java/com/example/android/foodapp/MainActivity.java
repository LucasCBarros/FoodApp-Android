package com.example.android.foodapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    public void call_Menu_1 (View view){
        setContentView(R.layout.menu_principal);
    }

    /** TELA MAIN - LOGIN*/
    public void CarregaTelaPrincipal() {
        setContentView(R.layout.activity_main);

        ImageView BtnOK = (ImageView) findViewById(R.id.menu_1);
        BtnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                CarregaMenu();
            }
        });
    }

    /** TELA PRINCIPAL*/
    public void CarregaMenu() {
        setContentView(R.layout.menu_principal);

        Button BtnVoltar = (Button) findViewById(R.id.btn_back);
        BtnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                CarregaTelaPrincipal();
            }
        });

        final ImageView openReceita = (ImageView) findViewById(R.id.receita_atual);
        openReceita.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                CarregaReceita();
            }
        });

        final TextView titulo = (TextView) findViewById(R.id.txt_titulo_receita);
        Button btn_gordo = (Button) findViewById(R.id.btn_gordo);
        btn_gordo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                openReceita.setImageResource(R.drawable.subway);
                titulo.setText("Subway");
            }
        });
    }

    /** TELA RECEITA*/
    public void CarregaReceita() {
        setContentView(R.layout.menu_receita);

        Button btn_receita = (Button) findViewById(R.id.btn_receita_back);
        btn_receita.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                CarregaMenu();
            }
        });


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregaTelaPrincipal();
    }

    }
