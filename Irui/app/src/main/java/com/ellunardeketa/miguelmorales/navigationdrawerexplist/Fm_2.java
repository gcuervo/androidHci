package com.ellunardeketa.miguelmorales.navigationdrawerexplist;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by miguelmorales on 20/4/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Fm_2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.resultados_busqueda, container, false);

        //Button button = (Button) findViewById(R.id.buttonFiltros);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Do something in response to button click
//            }
//        });
        return rootView;
    }
}
