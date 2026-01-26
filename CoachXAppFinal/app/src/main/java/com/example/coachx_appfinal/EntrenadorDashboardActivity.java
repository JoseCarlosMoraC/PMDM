package com.example.coachx_appfinal;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class EntrenadorDashboardActivity extends AppCompatActivity {

    private TextView tvUserName;
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


        tvUserName = findViewById(R.id.tvUserName);
        ivNotifications = findViewById(R.id.ivNotifications);
        ivSettings = findViewById(R.id.ivSettings);
        cvFichaTactica = findViewById(R.id.cvFichaTactica);
        cvEntrenamientos = findViewById(R.id.cvEntrenamientos);
        cvAlineaciones = findViewById(R.id.cvAlineaciones);
        cvAsistencias = findViewById(R.id.cvAsistencias);
        btnVerEjercicios = findViewById(R.id.btnVerEjercicios);


        ivNotifications.setOnClickListener(v ->
                Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show()
        );

        ivSettings.setOnClickListener(v ->
                Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT).show()
        );

        cvFichaTactica.setOnClickListener(v ->
                Toast.makeText(this, "Ficha Táctica", Toast.LENGTH_SHORT).show()
        );

        cvEntrenamientos.setOnClickListener(v ->
                Toast.makeText(this, "Entrenamientos", Toast.LENGTH_SHORT).show()
        );

        cvAlineaciones.setOnClickListener(v ->
                Toast.makeText(this, "Alineaciones", Toast.LENGTH_SHORT).show()
        );

        cvAsistencias.setOnClickListener(v ->
                Toast.makeText(this, "Asistencias", Toast.LENGTH_SHORT).show()
        );

        btnVerEjercicios.setOnClickListener(v ->
                Toast.makeText(this, "Ver ejercicios recomendados", Toast.LENGTH_SHORT).show()
        );
    }
}