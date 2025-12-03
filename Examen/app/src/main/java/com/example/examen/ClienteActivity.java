package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.examen.R;
import com.example.examen.SolicitarCitaActivity;

import java.util.ArrayList;

public class ClienteActivity extends AppCompatActivity {

    private ListView listaCitas;
    private Button botoncitoSolicitar;
    private ArrayList<String> misCitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        initViews();
        cargarMisCitas();
        setupListeners();
    }

    private void initViews() {
        listaCitas = findViewById(R.id.listaCitas);
        botoncitoSolicitar = findViewById(R.id.solicitarCita);
    }

    private void cargarMisCitas() {
        misCitas = new ArrayList<>();
        misCitas.add("Está confirmado");
        misCitas.add("Pendiente");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                misCitas
        );
        listaCitas.setAdapter(adapter);
    }

    private void setupListeners() {
        botoncitoSolicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClienteActivity.this, SolicitarCitaActivity.class);
                startActivity(intent);
            }
        });
    }
}