package com.example.proyectocoachx.Models;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Abrir LoginActivity directamente
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

        // Cerrar MainActivity para que no quede en el back stack
        finish();
    }
}
