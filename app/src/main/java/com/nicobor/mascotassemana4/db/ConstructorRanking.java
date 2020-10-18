package com.nicobor.mascotassemana4.db;

import android.content.ContentValues;
import android.content.Context;

import com.nicobor.mascotassemana4.R;
import com.nicobor.mascotassemana4.classes.Mascota;

import java.util.ArrayList;

public class ConstructorRanking {

    private Context context;

    public ConstructorRanking(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> getRanking(){

        BaseDatos db = new BaseDatos( context );
        return db.getRanking();
    }

    public void insertMascotas( BaseDatos db ){
        ContentValues contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Tommy" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app1 );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Yuli" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app8 );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Esti" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app2 );
        db.insertMascota( contentValues );
    }
}
