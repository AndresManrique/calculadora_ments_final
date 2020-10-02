package com.example.ments_v4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class vprocedimiento extends Fragment {
    int puntaje_procedimiento = 0;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vprocedimiento, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final int[] puntajes={1,1,2,3,4,5};

        //Spinners
        Spinner spinner_1_q_1 = (Spinner) view.findViewById(R.id.spinner_1_q_1);
        ArrayAdapter<CharSequence> q_1_1 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_1_q_1, android.R.layout.simple_spinner_item);
        q_1_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1_q_1.setAdapter(q_1_1);
        spinner_1_q_1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajes[i];
                //String text = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        view.findViewById(R.id.button_vprocedimiento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vprocedimientoDirections.ActionVprocedimientoToVresultado actionVprocedimientoToVresultado4 = vprocedimientoDirections.actionVprocedimientoToVresultado(0,0,0);
                actionVprocedimientoToVresultado4.setValorProcedimientoR(puntaje_procedimiento);
                NavHostFragment.findNavController(vprocedimiento.this)
                        .navigate(R.id.action_vprocedimiento_to_vpaciente);
            }
        });
    }
}