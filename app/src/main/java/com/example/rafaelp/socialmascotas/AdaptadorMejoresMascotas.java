package com.example.rafaelp.socialmascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Rafael p on 11/3/2017.
 */

public class AdaptadorMejoresMascotas extends RecyclerView.Adapter<AdaptadorMejoresMascotas.AdaptadorHolder> {
    private ArrayList<Mascota> mascotas;
    private Activity actividad;

    public AdaptadorMejoresMascotas(ArrayList<Mascota> mascota,Activity actividad){
        this.mascotas=mascota;
        this.actividad=actividad;
    }

    @Override
    public AdaptadorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.cartview_mascotas,parent,false);
        return new AdaptadorHolder(vista);
    }

    @Override
    public void onBindViewHolder(AdaptadorHolder holder, int position) {
        if(Integer.parseInt(holder.contador.getText().toString())>5){
            Mascota mascota=mascotas.get(position);
            holder.imagen.setImageResource(mascota.getImagen());
            holder.contador.setText(String.valueOf(mascota.getContador()));
            holder.nombre.setText(mascota.getNombre());
        }
        else{
            Toast.makeText(actividad,"No hay mas cotas con 5 estrellas",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class AdaptadorHolder extends RecyclerView.ViewHolder{

        private TextView nombre,contador;
        private ImageView hueso,likes,imagen;
        public AdaptadorHolder(View itemView) {
            super(itemView);
            nombre=(TextView)   itemView.findViewById(R.id.nombre);
            contador=(TextView) itemView.findViewById(R.id.contador);
            hueso=(ImageView)   itemView.findViewById(R.id.imagen_hueso);
            likes=(ImageView)   itemView.findViewById(R.id.imageView);
            imagen=(ImageView)  itemView.findViewById(R.id.imagen_carta);

        }
    }

}
