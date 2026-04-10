package com.example.coachx_appfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class EntrenadorPlantillaActivity extends AppCompatActivity {

    private LinearLayout navInicio;
    private LinearLayout navCalendario;
    private LinearLayout navPlantilla;
    private LinearLayout navStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrenador_plantilla);

        navInicio     = findViewById(R.id.navInicio);
        navCalendario = findViewById(R.id.navCalendario);
        navPlantilla  = findViewById(R.id.navPlantilla);
        navStats      = findViewById(R.id.navStats);

        navInicio.setOnClickListener(v -> {
            startActivity(new Intent(this, EntrenadorDashboardActivity.class));
            finish();
        });

        navCalendario.setOnClickListener(v -> {
            startActivity(new Intent(this, EntrenadorCalendarActivity.class));
            finish();
        });

        // Ya estamos en Plantilla — no hacer nada
        navPlantilla.setOnClickListener(v -> { /* ya estamos aquí */ });

        navStats.setOnClickListener(v -> {
            startActivity(new Intent(this, EntrenadorStatsActivity.class));
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, EntrenadorDashboardActivity.class));
        finish();
    }
}
