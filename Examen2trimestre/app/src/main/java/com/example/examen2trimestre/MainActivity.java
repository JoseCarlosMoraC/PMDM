package com.example.examen2trimestre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etPassword;
    private Button btnAcceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        btnAcceso = findViewById(R.id.btnAcceso);

        btnAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuario.getText().toString();
                String password = etPassword.getText().toString();

                if (usuario.equals("estudiante") && password.equals("estudiante")) {
                    startActivity(new Intent(MainActivity.this, EstudianteActivity.class));
                    finish();
                } else if (usuario.equals("docente") && password.equals("docente")) {
                    startActivity(new Intent(MainActivity.this, DocenteActivity.class));
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}