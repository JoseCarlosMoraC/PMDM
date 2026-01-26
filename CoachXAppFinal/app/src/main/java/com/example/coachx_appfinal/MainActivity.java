package com.example.coachx_appfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIniciarSesion;
    private Button btnCrearCuenta;
    private TextView tvOlvidoContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        tvOlvidoContrasena = findViewById(R.id.tvOlvidoContrasena);


        btnIniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RoleSelectionActivity.class);
            startActivity(intent);
        });

        btnCrearCuenta.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Crear cuenta - Próximamente", Toast.LENGTH_SHORT).show()
        );

        tvOlvidoContrasena.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Recuperar contraseña - Próximamente", Toast.LENGTH_SHORT).show()
        );
    }
}