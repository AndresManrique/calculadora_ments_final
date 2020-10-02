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

        final int[] puntajesPr={1,1,2,3,4,5};

        //Spinners
        //Spinner 1
        Spinner spinner_Pr1 = (Spinner) view.findViewById(R.id.spinner_1_q_1);
        ArrayAdapter<CharSequence> adapter_Pr1 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_1_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr1.setAdapter(adapter_Pr1);
        spinner_Pr1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
                //String text = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 2
        Spinner spinner_Pr2 = (Spinner) view.findViewById(R.id.spinner_2_q_1);
        ArrayAdapter<CharSequence> adapter_Pr2 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_2_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr2.setAdapter(adapter_Pr2);
        spinner_Pr2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 3
        Spinner spinner_Pr3 = (Spinner) view.findViewById(R.id.spinner_3_q_1);
        ArrayAdapter<CharSequence> adapter_Pr3 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_3_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr3.setAdapter(adapter_Pr3);
        spinner_Pr3.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 4
        Spinner spinner_Pr4 = (Spinner) view.findViewById(R.id.spinner_4_q_1);
        ArrayAdapter<CharSequence> adapter_Pr4 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_4_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr4.setAdapter(adapter_Pr4);
        spinner_Pr4.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 5
        Spinner spinner_Pr5 = (Spinner) view.findViewById(R.id.spinner_5_q_1);
        ArrayAdapter<CharSequence> adapter_Pr5 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_5_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr5.setAdapter(adapter_Pr5);
        spinner_Pr5.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 6
        Spinner spinner_Pr6 = (Spinner) view.findViewById(R.id.spinner_6_q_1);
        ArrayAdapter<CharSequence> adapter_Pr6 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_6_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr6.setAdapter(adapter_Pr6);
        spinner_Pr6.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 7
        Spinner spinner_Pr7 = (Spinner) view.findViewById(R.id.spinner_7_q_1);
        ArrayAdapter<CharSequence> adapter_Pr7 = ArrayAdapter.createFromResource(getContext(),
                R.array.options_7_q_1, android.R.layout.simple_spinner_item);
        adapter_Pr7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pr7.setAdapter(adapter_Pr7);
        spinner_Pr7.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_procedimiento = puntaje_procedimiento + puntajesPr[i];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        view.findViewById(R.id.button_vprocedimiento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vprocedimientoDirections.ActionVprocedimientoToVresultado actionVprocedimientoToVresultado4 = vprocedimientoDirections.actionVprocedimientoToVresultado();
                actionVprocedimientoToVresultado4.setValorProcedimientoR(puntaje_procedimiento);
                NavHostFragment.findNavController(vprocedimiento.this)
                        .navigate(R.id.action_vprocedimiento_to_vpaciente);
            }
        });
    }
}