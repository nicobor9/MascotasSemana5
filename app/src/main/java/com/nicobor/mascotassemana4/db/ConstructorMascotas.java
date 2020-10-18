package com.nicobor.mascotassemana4.db;

import android.content.ContentValues;
import android.content.Context;

import com.nicobor.mascotassemana4.Contacto;
import com.nicobor.mascotassemana4.R;
import com.nicobor.mascotassemana4.classes.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> getMascotas(){

        BaseDatos db = new BaseDatos( context );
        if( db.getMascotas().size() == 0 )
            insertMascotas( db );
        return db.getMascotas();
    }

    public void insertMascotas( BaseDatos db ){
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.app1, "Tommy", 5) );
        mascotas.add( new Mascota(R.drawable.app2, "Yuli", 1) );
        mascotas.add( new Mascota(R.drawable.app3, "Esti", 2) );
        mascotas.add( new Mascota(R.drawable.app4, "Misi", 11) );
        mascotas.add( new Mascota(R.drawable.app5, "Coraje", 10) );
        mascotas.add( new Mascota(R.drawable.app6, "Lupo", 4) );
        mascotas.add( new Mascota(R.drawable.app7, "Bote", 20) );
        mascotas.add( new Mascota(R.drawable.app8, "Qiqo", 2) );

        for (Mascota mascota: mascotas){
            ContentValues contentValues = new ContentValues();
            contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, mascota.getNombre() );
            contentValues.put( Config.TABLE_MASCOTAS_FOTO, mascota.getImage() );
            db.insertMascota( contentValues );
        }
    }

    public void darLikeMascota( Mascota mascota ){
        BaseDatos db = new BaseDatos( context );
        ContentValues contentValues = new ContentValues();
        contentValues.put(  Config.TABLE_MASCOTAS_LIKES_ID_MASCOTA, mascota.getId() );
        contentValues.put( Config.TABLE_MASCOTAS_LIKES_NUMERO_LIKES, 1 );
        db.insertLike( contentValues );
    }

    public int getLikesMascota( Mascota mascota ){
        BaseDatos db = new BaseDatos( context );
        return db.getLikes( mascota );
    }

}
