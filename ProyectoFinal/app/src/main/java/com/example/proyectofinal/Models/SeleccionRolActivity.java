package com.example.proyectofinal.Models;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinal.R;
import com.example.proyectofinal.Models.CoordinadorDashboardActivity;
import com.example.proyectofinal.Models.DelegadoActivity;
import com.example.proyectofinal.Models.EntrenadorDashboardActivity;

public class SeleccionRolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_rol);

        LinearLayout btnCoordinador = findViewById(R.id.btnCoordinador);
        LinearLayout btnEntrenador = findViewById(R.id.btnEntrenador);
        LinearLayout btnDelegado = findViewById(R.id.btnDelegado);
        TextView tvVolver = findViewById(R.id.tvVolver);

        // Al hacer click en Coordinador
        btnCoordinador.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionRolActivity.this, CoordinadorDashboardActivity.class);
            startActivity(intent);
        });

        // Al hacer click en Entrenador
        btnEntrenador.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionRolActivity.this, EntrenadorDashboardActivity.class);
            startActivity(intent);
        });

        // Al hacer click en Delegado
        btnDelegado.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionRolActivity.this, DelegadoActivity.class);
            startActivity(intent);
        });

        // Botón volver
        tvVolver.setOnClickListener(v -> {
            finish(); // Vuelve a la pantalla anterior (Login)
        });
    }
}