package com.example.agenda;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>
                (Arrays.asList("Sara", "Fran", "Jose"));
       ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
       listaDeAlunos.setAdapter(new ArrayAdapter<String>(
               this,
               android.R.layout.simple_list_item_1,
               alunos));
    }
}