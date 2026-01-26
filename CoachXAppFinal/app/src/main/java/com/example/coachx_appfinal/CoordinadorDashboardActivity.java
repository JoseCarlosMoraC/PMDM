package com.example.coachx_appfinal;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

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

        // Inicializar vistas
        btnNotifications = findViewById(R.id.btnNotifications);
        btnSettings = findViewById(R.id.btnSettings);
        btnCrearEquipo = findViewById(R.id.btnCrearEquipo);
        btnAnadirJugador = findViewById(R.id.btnAnadirJugador);
        navInicio = findViewById(R.id.navInicio);
        navEquipos = findViewById(R.id.navEquipos);
        navStats = findViewById(R.id.navStats);
        navPerfil = findViewById(R.id.navPerfil);

        // Configurar listeners
        btnNotifications.setOnClickListener(v ->
                Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show()
        );

        btnSettings.setOnClickListener(v ->
                Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT).show()
        );

        btnCrearEquipo.setOnClickListener(v ->
                Toast.makeText(this, "Crear nuevo equipo", Toast.LENGTH_SHORT).show()
        );

        btnAnadirJugador.setOnClickListener(v ->
                Toast.makeText(this, "Añadir jugador", Toast.LENGTH_SHORT).show()
        );

        navInicio.setOnClickListener(v ->
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
        );

        navEquipos.setOnClickListener(v ->
                Toast.makeText(this, "Equipos", Toast.LENGTH_SHORT).show()
        );

        navStats.setOnClickListener(v ->
                Toast.makeText(this, "Estadísticas", Toast.LENGTH_SHORT).show()
        );

        navPerfil.setOnClickListener(v ->
                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
        );
    }
}