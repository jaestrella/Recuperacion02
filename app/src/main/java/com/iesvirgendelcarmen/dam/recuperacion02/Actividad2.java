package com.iesvirgendelcarmen.dam.recuperacion02;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by matinal on 16/03/2018.
 */

public class Actividad2 extends Fragment {
    MainActivity main=new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.actividad2, container, false);
/*
        Button lanzarActivity=(Button)view.findViewById(R.id.lanzarActivity);
        lanzarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        Button lanzarFragmento3=(Button)view.findViewById(R.id.lanzarFragmento3);
        lanzarFragmento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //main.cambiarFragmento2();
            }
        });*/
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button lanzarActivity=(Button)getActivity().findViewById(R.id.lanzarActivity);
        lanzarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        Button lanzarFragmento3=(Button)getActivity().findViewById(R.id.lanzarFragmento3);
        lanzarFragmento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.cambiarFragmento2();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(),"fragmento1",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"estoy en create fragmento1",Toast.LENGTH_SHORT).show();
    }

    public interface onClick{
        
    }
}
