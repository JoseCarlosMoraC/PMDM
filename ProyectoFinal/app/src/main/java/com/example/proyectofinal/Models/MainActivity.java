package com.example.proyectofinal.Models;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinal.R;  // ✅ Import correcto

public class MainActivity extends AppCompatActivity {

    private Button btnIniciarSesion;
    private Button btnCrearCuenta;
    private TextView tvOlvidoContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ahora usamos activity_main.xml

        // Inicializamos los botones
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        tvOlvidoContrasena = findViewById(R.id.tvOlvidoContrasena);

        // Configuramos listeners
    /*  btnIniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SeleccionRolActivity.class);
            startActivity(intent);
        });
*/
        btnCrearCuenta.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Crear cuenta - Próximamente", Toast.LENGTH_SHORT).show()
        );

        tvOlvidoContrasena.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Recuperar contraseña - Próximamente", Toast.LENGTH_SHORT).show()
        );
    }
}
