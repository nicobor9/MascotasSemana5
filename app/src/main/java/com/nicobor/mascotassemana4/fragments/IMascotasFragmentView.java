package com.nicobor.mascotassemana4.fragments;

import com.nicobor.mascotassemana4.adapters.MascotaAdaptador;
import com.nicobor.mascotassemana4.classes.Mascota;

import java.util.ArrayList;

public interface IMascotasFragmentView {
    public void generateLinearLayot();
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas );
    public void initAdaptadorRV( MascotaAdaptador adaptador );
}
