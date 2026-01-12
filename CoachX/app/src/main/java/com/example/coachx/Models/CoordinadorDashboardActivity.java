package com.example.coachx.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coachx.R;

public class CoordinadorDashboardActivity extends AppCompatActivity {

    private ImageView btnNotifications;
    private ImageView btnSettings;
    private LinearLayout btnCrearEquipo;
    private LinearLayout btnAnadirJugador;
    private LinearLayout navInicio;
    private LinearLayout navEquipos;
    private LinearLayout navStats;
    private LinearLayout navPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinador_dashboard);

        initViews();
        setupListeners();
    }

    private void initViews() {
        btnNotifications = findViewById(R.id.btnNotifications);
        btnSettings = findViewById(R.id.btnSettings);

        btnCrearEquipo = findViewById(R.id.btnCrearEquipo);
        btnAnadirJugador = findViewById(R.id.btnAnadirJugador);

        // Bottom navigation
        navInicio = findViewById(R.id.navInicio);
        navEquipos = findViewById(R.id.navEquipos);
        navStats = findViewById(R.id.navStats);
        navPerfil = findViewById(R.id.navPerfil);
    }

    private void setupListeners() {
        btnNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Notificaciones", Toast.LENGTH_SHORT).show();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Configuración", Toast.LENGTH_SHORT).show();
            }
        });

        btnCrearEquipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Crear nuevo equipo", Toast.LENGTH_SHORT).show();
            }
        });

        btnAnadirJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Añadir jugador", Toast.LENGTH_SHORT).show();
            }
        });


        navInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ya estamos en inicio
                Toast.makeText(CoordinadorDashboardActivity.this, "Inicio", Toast.LENGTH_SHORT).show();
            }
        });

        navEquipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Equipos - Próximamente", Toast.LENGTH_SHORT).show();
            }
        });

        navStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Stats - Próximamente", Toast.LENGTH_SHORT).show();
            }
        });

        navPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CoordinadorDashboardActivity.this, "Perfil - Próximamente", Toast.LENGTH_SHORT).show();
            }
        });
    }
}