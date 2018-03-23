package com.iesvirgendelcarmen.dam.recuperacion02;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by matinal on 16/03/2018.
 */

public class Actividad3 extends Fragment {
    MainActivity main=new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.actividad3, container, false);

        Button lanzarActivity=(Button)view.findViewById(R.id.lanzarActivity);
        lanzarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        Button lanzarFragmento2=(Button)view.findViewById(R.id.lanzarFragmento2);
        lanzarFragmento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.cambiarFragmento1();
            }
        });



       return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(),"fragmento2",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(),"estoy en start fragmento2",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(),"estoy en pause fragmento2",Toast.LENGTH_SHORT).show();
        Log.v("Momento:","estoy en pause fragmento2");
    }


}
