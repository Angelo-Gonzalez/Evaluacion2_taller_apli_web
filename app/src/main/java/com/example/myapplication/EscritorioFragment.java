package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EscritorioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EscritorioFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vistadesk;
    Button botondesk;

    public EscritorioFragment() {
        // Required empty public constructor
    }

    public static EscritorioFragment newInstance(String param1, String param2) {
        EscritorioFragment fragment = new EscritorioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vistadesk = inflater.inflate(R.layout.fragment_escritorio, container, false);

        // Encontrar el botón después de inflar la vista
        botondesk = vistadesk.findViewById(R.id.btn_desk);

        // Configurar el listener para abrir la actividad Desk_activity
        botondesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el intent para abrir Desk_activity
                Intent intent = new Intent(getActivity(), Desk_Activity.class);
                startActivity(intent);
            }
        });

        return vistadesk;
    }
}
