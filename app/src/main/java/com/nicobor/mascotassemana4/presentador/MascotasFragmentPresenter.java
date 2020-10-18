package com.nicobor.mascotassemana4.presentador;

import android.content.Context;

import com.nicobor.mascotassemana4.classes.Mascota;
import com.nicobor.mascotassemana4.db.ConstructorMascotas;
import com.nicobor.mascotassemana4.db.ConstructorRanking;
import com.nicobor.mascotassemana4.fragments.IMascotasFragmentView;
import com.nicobor.mascotassemana4.fragments.IRankingFragmentView;

import java.util.ArrayList;

public class MascotasFragmentPresenter implements IMascotasFragmentPresenter {

    private IMascotasFragmentView iMascotasFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public MascotasFragmentPresenter(IMascotasFragmentView iMascotasFragmentView, Context context) {
        this.iMascotasFragmentView = iMascotasFragmentView;
        this.context = context;
    }

    @Override
    public void obtenerMascotasBD() {
        constructorMascotas = new ConstructorMascotas( context );
        mascotas =  constructorMascotas.getMascotas();
        mostrarMascotas();
    }

    @Override
    public void mostrarMascotas() {
        iMascotasFragmentView.initAdaptadorRV( iMascotasFragmentView.generateMascotaAdaptador( mascotas ) );
        iMascotasFragmentView.generateLinearLayot();
    }
}
