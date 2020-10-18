package com.nicobor.mascotassemana4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicobor.mascotassemana4.R;
import com.nicobor.mascotassemana4.adapters.MascotaAdaptador;
import com.nicobor.mascotassemana4.adapters.PerfilAdaptador;
import com.nicobor.mascotassemana4.classes.Mascota;
import com.nicobor.mascotassemana4.classes.Perfil;

import java.util.ArrayList;


public class MiMascotaFragment extends Fragment {

    private ArrayList<Perfil> fotos;
    private RecyclerView rvMiMascota;

    public MiMascotaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mi_mascota, container, false);

        rvMiMascota = (RecyclerView) v.findViewById(R.id.rvMiMascota);

        GridLayoutManager glm = new GridLayoutManager( getContext(), 3 );

        rvMiMascota.setLayoutManager(glm);

        initFotos();

        rvMiMascota.setAdapter( new PerfilAdaptador( fotos ) );

        return v;
    }

    public void initFotos(){
        fotos = new ArrayList<Perfil>();
        fotos.add( new Perfil(R.drawable.app1,  5) );
        fotos.add( new Perfil(R.drawable.app1, 1) );
        fotos.add( new Perfil(R.drawable.app1, 2) );
        fotos.add( new Perfil(R.drawable.app1,  11) );
        fotos.add( new Perfil(R.drawable.app1,  10) );
        fotos.add( new Perfil(R.drawable.app1, 4) );
        fotos.add( new Perfil(R.drawable.app1,  20) );
        fotos.add( new Perfil(R.drawable.app1, 25) );
        fotos.add( new Perfil(R.drawable.app1, 11) );
        fotos.add( new Perfil(R.drawable.app1, 12) );
    }
}