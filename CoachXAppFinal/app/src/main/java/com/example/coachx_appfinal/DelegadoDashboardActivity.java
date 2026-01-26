package com.example.coachx_appfinal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DelegadoDashboardActivity extends AppCompatActivity {

    private ImageView btnNotifications;
    private ImageView btnSettings;
    private Button btnIniciarRegistro;
    private LinearLayout btnConvocarJugadores;
    private LinearLayout btnVerAlineacion;
    private LinearLayout btnHistorialPartidos;
    private LinearLayout navInicio;
    private LinearLayout navPartidos;
    private LinearLayout navActas;
    private LinearLayout navPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegado_dashboard);

        // Inicializar vistas
        btnNotifications = findViewById(R.id.btnNotifications);
        btnSettings = findViewById(R.id.btnSettings);
        btnIniciarRegistro = findViewById(R.id.btnIniciarRegistro);
        btnConvocarJugadores = findViewById(R.id.btnConvocarJugadores);
        btnVerAlineacion = findViewById(R.id.btnVerAlineacion);
        btnHistorialPartidos = findViewById(R.id.btnHistorialPartidos);
        navInicio = findViewById(R.id.navInicio);
        navPartidos = findViewById(R.id.navPartidos);
        navActas = findViewById(R.id.navActas);
        navPerfil = findViewById(R.id.navPerfil);

        // Configurar listeners
        btnNotifications.setOnClickListener(v ->
                Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show()
        );

        btnSettings.setOnClickListener(v ->
                Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT).show()
        );

        btnIniciarRegistro.setOnClickListener(v ->
                Toast.makeText(this, "Iniciar Registro de partido", Toast.LENGTH_SHORT).show()
        );

        btnConvocarJugadores.setOnClickListener(v ->
                Toast.makeText(this, "Convocar jugadores", Toast.LENGTH_SHORT).show()
        );

        btnVerAlineacion.setOnClickListener(v ->
                Toast.makeText(this, "Ver alineación", Toast.LENGTH_SHORT).show()
        );

        btnHistorialPartidos.setOnClickListener(v ->
                Toast.makeText(this, "Historial de partidos", Toast.LENGTH_SHORT).show()
        );

        navInicio.setOnClickListener(v ->
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
        );

        navPartidos.setOnClickListener(v ->
                Toast.makeText(this, "Partidos", Toast.LENGTH_SHORT).show()
        );

        navActas.setOnClickListener(v ->
                Toast.makeText(this, "Actas", Toast.LENGTH_SHORT).show()
        );

        navPerfil.setOnClickListener(v ->
                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
        );
    }
}