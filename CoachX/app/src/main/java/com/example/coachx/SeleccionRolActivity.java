package com.example.coachx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SeleccionRolActivity extends AppCompatActivity {

    private LinearLayout btnCoordinador;
    private LinearLayout btnEntrenador;
    private LinearLayout btnDelegado;
    private TextView tvVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_seleccion_rol);

        initViews();
        setupListeners();
    }

    private void initViews() {
        btnCoordinador = findViewById(R.id.btnCoordinador);
        btnEntrenador = findViewById(R.id.btnEntrenador);
        btnDelegado = findViewById(R.id.btnDelegado);
        tvVolver = findViewById(R.id.tvVolver);
    }

    private void setupListeners() {
        btnCoordinador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SeleccionRolActivity.this, CoordinadorDashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnEntrenador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SeleccionRolActivity.this, "Dashboard Entrenador - Próximamente", Toast.LENGTH_SHORT).show();
            }
        });

        btnDelegado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SeleccionRolActivity.this, "Dashboard Delegado - Próximamente", Toast.LENGTH_SHORT).show();
            }
        });

        tvVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}