package com.example.proyectofinal.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.proyectofinal.R;

public class EntrenadorDashboardActivity extends AppCompatActivity {

    private ImageView ivNotifications;
    private ImageView ivSettings;

    private CardView cvFichaTactica;
    private CardView cvEntrenamientos;
    private CardView cvAlineaciones;
    private CardView cvAsistencias;

    private Button btnVerEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrenador_dashboard);

        initViews();
        setupListeners();
    }

    private void initViews() {
        // Header buttons
        ivNotifications = findViewById(R.id.ivNotifications);
        ivSettings = findViewById(R.id.ivSettings);

        // Herramientas cards
        cvFichaTactica = findViewById(R.id.cvFichaTactica);
        cvEntrenamientos = findViewById(R.id.cvEntrenamientos);
        cvAlineaciones = findViewById(R.id.cvAlineaciones);
        cvAsistencias = findViewById(R.id.cvAsistencias);

        // IA subscription button
        btnVerEjercicios = findViewById(R.id.btnVerEjercicios);
    }

    private void setupListeners() {
        ivNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Notificaciones", Toast.LENGTH_SHORT).show();
            }
        });

        ivSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Configuración", Toast.LENGTH_SHORT).show();
            }
        });

        cvFichaTactica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Ficha Táctica", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(EntrenadorDashboardActivity.this, FichaTacticaActivity.class);
                // startActivity(intent);
            }
        });

        cvEntrenamientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Entrenamientos", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(EntrenadorDashboardActivity.this, EntrenamientosActivity.class);
                // startActivity(intent);
            }
        });

        cvAlineaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Alineaciones", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(EntrenadorDashboardActivity.this, AlineacionesActivity.class);
                // startActivity(intent);
            }
        });

        cvAsistencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Asistencias", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(EntrenadorDashboardActivity.this, AsistenciasActivity.class);
                // startActivity(intent);
            }
        });

        btnVerEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EntrenadorDashboardActivity.this, "Ver ejercicios recomendados", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(EntrenadorDashboardActivity.this, EjerciciosIAActivity.class);
                // startActivity(intent);
            }
        });
    }
}