package com.example.rafaelp.socialmascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView reciclar;
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar barra=(Toolbar) findViewById(R.id.navegacion);
        setSupportActionBar(barra);
        reciclar=(RecyclerView) findViewById(R.id.Reciclar);
        ImageView siguiente=(ImageView)findViewById(R.id.siguiente);
        reciclar.setLayoutManager(new LinearLayoutManager(this));
        reciclar.setAdapter(new Adaptador(Datos.datos(),this));
        intento=new Intent(this,MejoresMascotas.class);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intento);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuOpciones=getMenuInflater();
        menuOpciones.inflate(R.menu.menu_opciones,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.editar:
                Toast.makeText(this,"Editado",Toast.LENGTH_SHORT).show();
            break;

            case R.id.eliminar:
                Toast.makeText(this,"Eliminado",Toast.LENGTH_SHORT).show();
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}

