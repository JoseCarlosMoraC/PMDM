package com.example.coachx_appfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RoleSelectionActivity extends AppCompatActivity {

    private Button btnEntrenador;
    private Button btnCoordinador;
    private Button btnDelegado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);

        btnEntrenador = findViewById(R.id.btnEntrenador);
        btnCoordinador = findViewById(R.id.btnCoordinador);
        btnDelegado = findViewById(R.id.btnDelegado);

        btnEntrenador.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this, EntrenadorDashboardActivity.class);
            startActivity(intent);
            finish();
        });

        btnCoordinador.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this, CoordinadorDashboardActivity.class);
            startActivity(intent);
            finish();
        });

        btnDelegado.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this, DelegadoDashboardActivity.class);
            startActivity(intent);
            finish();
        });
    }
}