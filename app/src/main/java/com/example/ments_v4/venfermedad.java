package com.example.ments_v4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link venfermedad#newInstance} factory method to
 * create an instance of this fragment.
 */
public class venfermedad extends Fragment {

    int puntaje_enfermedad = 0;
    int spinner_prev_e1 = 0;
    int spinner_prev_e2 = 0;
    int spinner_prev_e3 = 0;
    int spinner_prev_e4 = 0;
    int spinner_prev_e5 = 0;
    int spinner_prev_e6 = 0;
    int valor_paciente_imported;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public venfermedad() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment venfermedad.
     */
    // TODO: Rename and change types and number of parameters
    public static venfermedad newInstance(String param1, String param2) {
        venfermedad fragment = new venfermedad();
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
        return inflater.inflate(R.layout.venfermedad, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        assert getArguments() != null;
        valor_paciente_imported = venfermedadArgs.fromBundle(getArguments()).getValorPaciente2();
        System.out.println("Valor recibido: " + valor_paciente_imported + "!!!!!!!!!!!!!!!!" );

        final int[] puntajes={0,1,2,3,4,5};
        System.out.println("-------------------------------Enfermedad----------------------------------");
        //Spinners
        //Spinner 2_E
        Spinner spinner2_E = (Spinner) view.findViewById(R.id.spinner2_E);
        ArrayAdapter<CharSequence> adapter2_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner2_Et, android.R.layout.simple_spinner_item);
        adapter2_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2_E.setAdapter(adapter2_E);
        spinner2_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e1;
                spinner_prev_e1 = puntajes[i];
                System.out.println("Puntaje spinner 1: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
                //String text = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Spinner 3_E
        Spinner spinner3_E = (Spinner) view.findViewById(R.id.spinner3_E);
        ArrayAdapter<CharSequence> adapter3_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner3_Et, android.R.layout.simple_spinner_item);
        adapter3_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3_E.setAdapter(adapter3_E);
        spinner3_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e2;
                spinner_prev_e2 = puntajes[i];
                System.out.println("Puntaje spinner 2: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Spinner 4_E
        Spinner spinner4_E = (Spinner) view.findViewById(R.id.spinner4_E);
        ArrayAdapter<CharSequence> adapter4_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner4_Et, android.R.layout.simple_spinner_item);
        adapter4_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4_E.setAdapter(adapter4_E);
        spinner4_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e3;
                spinner_prev_e3 = puntajes[i];
                System.out.println("Puntaje spinner 3: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Spinner 5_E
        Spinner spinner5_E = (Spinner) view.findViewById(R.id.spinner5_E);
        ArrayAdapter<CharSequence> adapter5_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner5_Et, android.R.layout.simple_spinner_item);
        adapter5_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5_E.setAdapter(adapter5_E);
        spinner5_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e4;
                spinner_prev_e4 = puntajes[i];
                System.out.println("Puntaje spinner 4: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Spinner 6_E
        Spinner spinner6_E = (Spinner) view.findViewById(R.id.spinner6_E);
        ArrayAdapter<CharSequence> adapter6_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner6_Et, android.R.layout.simple_spinner_item);
        adapter6_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6_E.setAdapter(adapter6_E);
        spinner6_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e5;
                spinner_prev_e5 =  puntajes[i];
                System.out.println("Puntaje spinner 5: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Spinner 7_E
        Spinner spinner7_E = (Spinner) view.findViewById(R.id.spinner7_E);
        ArrayAdapter<CharSequence> adapter7_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner7_Et, android.R.layout.simple_spinner_item);
        adapter7_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7_E.setAdapter(adapter7_E);
        spinner7_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i] - spinner_prev_e6;
                spinner_prev_e6 = puntajes[i];
                System.out.println("Puntaje spinner 6: "+puntaje_enfermedad+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        view.findViewById(R.id.button_venfermedad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                venfermedadDirections.ActionVenfermedadToVresultado action_set_enfermedad = venfermedadDirections.actionVenfermedadToVresultado();
                action_set_enfermedad.setValorEnfermedadR(puntaje_enfermedad + valor_paciente_imported);
                NavHostFragment.findNavController(venfermedad.this)
                        .navigate(action_set_enfermedad);
            }
        });
    }
}

