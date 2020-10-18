package com.nicobor.mascotassemana4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicobor.mascotassemana4.classes.Mascota;
import com.nicobor.mascotassemana4.R;
import com.nicobor.mascotassemana4.adapters.MascotaAdaptador;
import com.nicobor.mascotassemana4.presentador.IMascotasFragmentPresenter;
import com.nicobor.mascotassemana4.presentador.IRankingFragmentPresenter;
import com.nicobor.mascotassemana4.presentador.MascotasFragmentPresenter;
import com.nicobor.mascotassemana4.presentador.RankingFragmentPresenter;

import java.util.ArrayList;

public class MascotasFragment extends Fragment implements IMascotasFragmentView {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IMascotasFragmentPresenter iMascotasFragmentPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        iMascotasFragmentPresenter = new MascotasFragmentPresenter( this, getContext() );
        iMascotasFragmentPresenter.obtenerMascotasBD();
        generateLinearLayot();

        return v;
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.app1, "Tommy", 5) );
        mascotas.add( new Mascota(R.drawable.app2, "Yuli", 1) );
        mascotas.add( new Mascota(R.drawable.app3, "Esti", 2) );
        mascotas.add( new Mascota(R.drawable.app4, "Misi", 11) );
        mascotas.add( new Mascota(R.drawable.app5, "Lupo", 10) );
        mascotas.add( new Mascota(R.drawable.app6, "Rocko", 4) );
        mascotas.add( new Mascota(R.drawable.app7, "Caro", 20) );
        mascotas.add( new Mascota(R.drawable.app8, "Milo", 2) );
    }

    @Override
    public void generateLinearLayot() {
        LinearLayoutManager llm = new LinearLayoutManager( getContext() );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador( mascotas );
        return mascotaAdaptador;
    }

    @Override
    public void initAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter( adaptador );
    }
}