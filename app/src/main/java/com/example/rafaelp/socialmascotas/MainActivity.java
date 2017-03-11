package com.example.rafaelp.socialmascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView reciclar;
    ArrayList<Mascota>mascota;
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar barra=(Toolbar) findViewById(R.id.navegacion);
        setSupportActionBar(barra);
        reciclar=(RecyclerView) findViewById(R.id.Reciclar);
        ImageView siguiente=(ImageView)findViewById(R.id.siguiente);
        datos();
        reciclar.setLayoutManager(new LinearLayoutManager(this));
        reciclar.setAdapter(new Adaptador(mascota,this));
        intento=new Intent(this,MejoresMascotas.class);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intento);
            }
        });

    }
    public void datos(){
        mascota=new ArrayList<>();
        mascota.add(new Mascota("Putti",0,R.drawable.dog_150920_640));
        mascota.add(new Mascota("persi",0,R.drawable.dog_150923_640));
        mascota.add(new Mascota("Mascota",0,R.drawable.dog_150963_640));
        mascota.add(new Mascota("martiri",0,R.drawable.mascota));
        mascota.add(new Mascota("camila",0,R.drawable.mascota_kawaii));
        mascota.add(new Mascota("cami",0,R.drawable.dog_150963_640));
        mascota.add(new Mascota("Pusi",0,R.drawable.dog_150923_640));


    }
}
