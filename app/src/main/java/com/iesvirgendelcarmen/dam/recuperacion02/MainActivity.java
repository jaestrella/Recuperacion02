package com.iesvirgendelcarmen.dam.recuperacion02;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Actividad2.onClick {
    Button boton,boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.boton);
        boton2=(Button)findViewById(R.id.boton2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Actividad2 actividad2=new Actividad2();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.contenedor,actividad2);
                ft.commit();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Actividad3 actividad3=new Actividad3();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.contenedor,actividad3);
                ft.commit();
            }
        });





    }

    public void cambiarFragmento1(){
        Actividad2 actividad2=new Actividad2();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.contenedor,actividad2);
        ft.commit();
    }

    public void cambiarFragmento2(){
        Actividad3 actividad3=new Actividad3();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.contenedor,actividad3);
        ft.commit();
    }
}
