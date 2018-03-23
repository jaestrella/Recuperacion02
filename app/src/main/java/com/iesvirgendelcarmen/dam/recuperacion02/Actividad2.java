package com.iesvirgendelcarmen.dam.recuperacion02;

import android.content.Context;
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
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.actividad2, container, false);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(),"fragmento1",Toast.LENGTH_SHORT).show();
    }
}
