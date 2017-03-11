package com.example.rafaelp.socialmascotas;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Rafael p on 10/3/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.AdaptadorHolder> {

    private ArrayList<Mascota> mascotas;
    private Activity actividad;

    public Adaptador(ArrayList<Mascota> mascota,Activity actividad){
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
        final Mascota mascota=mascotas.get(position);
        holder.foto.setImageResource(mascota.getImagen());
        holder.nombre.setText(mascota.getNombre());
        holder.contador.setText(String.valueOf(mascota.getContador()));
        final TextView numeroLike=holder.contador;
        holder.liken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascota.setContador(mascota.getContador()+1);
                //Toast.makeText(actividad,String.valueOf(mascota.getContador()),Toast.LENGTH_SHORT).show();
                numeroLike.setText(String.valueOf(mascota.getContador()));
                v.setClickable(false);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class AdaptadorHolder extends RecyclerView.ViewHolder{
        private TextView nombre,contador;
        private ImageView liken,foto,imageContador;
        public AdaptadorHolder(View itemView) {
            super(itemView);
            this.nombre=(TextView)   itemView.findViewById(R.id.nombre);
            this.contador=(TextView) itemView.findViewById(R.id.contador);
            this.liken=(ImageView)   itemView.findViewById(R.id.imagen_hueso);
            this.foto=(ImageView)    itemView.findViewById(R.id.imagen_carta);
            this.imageContador=(ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
