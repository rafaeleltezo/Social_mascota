package com.example.rafaelp.socialmascotas;

import java.util.ArrayList;

/**
 * Created by Rafael p on 11/3/2017.
 */

public class Datos {
    static ArrayList<Mascota>mascota;


    public static ArrayList<Mascota> datos(){
        mascota=new ArrayList<>();
        mascota.add(new Mascota("Putti",5,R.drawable.dog_150920_640));
        mascota.add(new Mascota("persi",0,R.drawable.dog_150923_640));
        mascota.add(new Mascota("Mascota",0,R.drawable.dog_150963_640));
        mascota.add(new Mascota("martiri",5,R.drawable.mascota));
        mascota.add(new Mascota("camila",0,R.drawable.mascota_kawaii));
        mascota.add(new Mascota("cami",5,R.drawable.dog_150963_640));
        mascota.add(new Mascota("Pusi",0,R.drawable.dog_150923_640));
        return mascota;
    }
}