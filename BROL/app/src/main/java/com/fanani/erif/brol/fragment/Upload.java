package com.fanani.erif.brol.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fanani.erif.brol.R;
import com.fanani.erif.brol.utama.Foto_Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class Upload extends Fragment {

    Button berikutnya;

    public Upload() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        berikutnya=(Button)view.findViewById(R.id.btnBerikutnya);
        berikutnya.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Foto_Map.class));
            }
        });
    }
}
