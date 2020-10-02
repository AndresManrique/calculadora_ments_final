package com.example.ments_v4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link vpaciente#newInstance} factory method to
 * create an instance of this fragment.
 */
public class vpaciente extends Fragment {
    int puntaje_paciente = 0;
    int spinner_prev_p1 = 0;
    int spinner_prev_p2 = 0;
    int spinner_prev_p3 = 0;
    int spinner_prev_p4 = 0;
    int spinner_prev_p5 = 0;
    int spinner_prev_p6 = 0;
    int spinner_prev_p7 = 0;
    int spinner_prev_p8 = 0;
    int valor_procedimiento_imported;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public vpaciente() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment vpaciente.
     */
    // TODO: Rename and change types and number of parameters
    public static vpaciente newInstance(String param1, String param2) {
        vpaciente fragment = new vpaciente();
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
        return inflater.inflate(R.layout.vpaciente, container, false);

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        assert getArguments() != null;
        valor_procedimiento_imported = vpacienteArgs.fromBundle(getArguments()).getValorProcedimiento2();
        System.out.println("Valor recibido: " + valor_procedimiento_imported + " !!!!!!!!!!!!!!!!!!!!");

        final int[] puntajesPa={0,1,2,3,4,5};
        System.out.println("-------------------------------Paciente----------------------------------");
        //Spinners
        //Spinner 1
        Spinner spinner1 = (Spinner) view.findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner1_Pt, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p1;
                spinner_prev_p1 = puntajesPa[i];
                System.out.println("Puntaje spinner 1: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 2
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner2_Pt, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p2;
                spinner_prev_p2 = puntajesPa[i];
                System.out.println("Puntaje spinner 2: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
                //String text = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 3
        Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner3_Pt, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p3;
                spinner_prev_p3 = puntajesPa[i];
                System.out.println("Puntaje spinner 3: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 4
        Spinner spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner4_Pt, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p4;
                spinner_prev_p4 = puntajesPa[i];
                System.out.println("Puntaje spinner 4: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 5
        Spinner spinner5 = (Spinner) view.findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner5_Pt, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] -spinner_prev_p5;
                spinner_prev_p5 = puntajesPa[i];
                System.out.println("Puntaje spinner 5: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 6
        Spinner spinner6 = (Spinner) view.findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner6_Pt, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
        spinner6.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p6;
                spinner_prev_p6 = puntajesPa[i];
                System.out.println("Puntaje spinner 6: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 7
        Spinner spinner7 = (Spinner) view.findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner7_Pt, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);
        spinner7.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p7;
                spinner_prev_p7 = puntajesPa[i];
                System.out.println("Puntaje spinner 7: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Spinner 8
        Spinner spinner8 = (Spinner) view.findViewById(R.id.spinner_8);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner_8_Pt, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);
        spinner8.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_paciente = puntaje_paciente + puntajesPa[i] - spinner_prev_p8;
                spinner_prev_p8 = puntajesPa[i];
                System.out.println("Puntaje spinner 8: "+puntaje_paciente+ " !!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        view.findViewById(R.id.button_vpaciente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpacienteDirections.ActionVpacienteToVenfermedad action_set_paciente_2 = vpacienteDirections.actionVpacienteToVenfermedad();
                action_set_paciente_2.setValorPaciente2(puntaje_paciente + valor_procedimiento_imported);
                NavHostFragment.findNavController(vpaciente.this)
                        .navigate(R.id.action_vpaciente_to_venfermedad);
            }
        });
    }
}