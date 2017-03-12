package com.example.rafaelp.socialmascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class MejoresMascotas extends AppCompatActivity {
    Intent intento;
    RecyclerView recilar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mejores_mascotas);
        intento=new Intent(this,MainActivity.class);
        recilar=(RecyclerView) findViewById(R.id.reciclarMejores);
        recilar.setLayoutManager(new LinearLayoutManager(this));
        recilar.setAdapter(new AdaptadorMejoresMascotas(Datos.datos(),this));
        ImageView regresar=(ImageView)findViewById(R.id.atras);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intento);
            }
        });

    }
}
