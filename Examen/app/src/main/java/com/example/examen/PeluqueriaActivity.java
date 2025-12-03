package com.example.examen;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.examen.R;

import java.util.ArrayList;

public class PeluqueriaActivity extends AppCompatActivity {

    private TextView titulo;
    private ListView listaCitas;
    private ArrayList<String> citasHoy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peluqueria);

        initViews();
        cargarCitasHoy();
    }

    private void initViews() {
        titulo = findViewById(R.id.titulo);
        listaCitas = findViewById(R.id.listaCitas);
        titulo.setText("Citas de hoy mi señor");
    }

    private void cargarCitasHoy() {
        citasHoy = new ArrayList<>();
        citasHoy.add("Parrado");
        citasHoy.add("Adrián");
        citasHoy.add("Antonio José");
        citasHoy.add("JC");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citasHoy
        );
        listaCitas.setAdapter(adapter);
    }
}