package com.example.proyecto1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);  // ← XML grande que generamos

        // --- EJEMPLOS DE CÓMO ACCEDER A LOS ELEMENTOS DEL LAYOUT ---

        // Header
        // TextView tvBienvenido = findViewById(R.id.tvBienvenido);
        // TextView tvNombre = findViewById(R.id.tvNombre);
        // TextView tvRol = findViewById(R.id.tvRol);

        // Stats
        // TextView tvEquipos = findViewById(R.id.tvEquipos);
        // TextView tvJugadores = findViewById(R.id.tvJugadores);
        // TextView tvEntrenadores = findViewById(R.id.tvEntrenadores);
        // TextView tvPartidos = findViewById(R.id.tvPartidos);

        // Botones
        // Button btnCrearEquipo = findViewById(R.id.btnCrearEquipo);
        // Button btnAñadirJugador = findViewById(R.id.btnAñadirJugador);

        // Actividad reciente
        // LinearLayout cardEntrenamiento = findViewById(R.id.cardEntrenamiento);
        // LinearLayout cardPartido = findViewById(R.id.cardPartido);

        // Navbar (si lo agregamos)
        // LinearLayout btnInicio = findViewById(R.id.btnInicio);
        // LinearLayout btnEquipos = findViewById(R.id.btnEquipos);
        // LinearLayout btnStats = findViewById(R.id.btnStats);
        // LinearLayout btnPerfil = findViewById(R.id.btnPerfil);

        // Aquí puedes añadir la lógica que quieras...
    }
}
