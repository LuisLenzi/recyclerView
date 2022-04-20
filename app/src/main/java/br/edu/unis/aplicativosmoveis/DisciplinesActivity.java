package br.edu.unis.aplicativosmoveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DisciplinesActivity extends AppCompatActivity {

    RecyclerView rvDisciplines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines);

        rvDisciplines = findViewById(R.id.rv_disciplines);
        rvDisciplines.setLayoutManager(new LinearLayoutManager(this));

        List<Discipline> disciplines = new ArrayList<>();
        disciplines.add(new Discipline("Engenharia de Software", "C.C", "8º período", android.R.color.holo_orange_light));
        disciplines.add(new Discipline("Projeto Interdisciplinar de Curso", "C.C", "8º período", R.color.purple_700));
        disciplines.add(new Discipline("Matemática Discreta", "C.C", "8º período", android.R.color.system_accent3_400));
        disciplines.add(new Discipline("Gestão de Projetos", "C.C", "8º período", android.R.color.holo_red_dark));
        disciplines.add(new Discipline("Ética e Responsabilidade Social", "C.C", "8º período", R.color.purple_700));
        disciplines.add(new Discipline("Comunicação e expressão", "C.C", "8º período", android.R.color.holo_orange_light));
        disciplines.add(new Discipline("Conhecimentos Gerais", "C.C", "8º período",R.color.teal_200));
        disciplines.add(new Discipline("Calculo III", "C.C", "8º período", android.R.color.system_neutral1_500));


        DisciplinesAdapter adapter = new DisciplinesAdapter(disciplines);
        rvDisciplines.setAdapter(adapter);
    }
}