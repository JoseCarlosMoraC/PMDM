package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.examen.ClienteActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText contraseña;
    private Button botonLogin;
    private Button botonCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
        setupListeners();
    }

    private void initViews() {
        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);
        botonLogin = findViewById(R.id.loginPeluqueria);
        botonCliente = findViewById(R.id.loginCliente);
    }

    private void setupListeners() {
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validar()) {
                    Intent intent = new Intent(LoginActivity.this, PeluqueriaActivity.class);
                    startActivity(intent);
                }
            }
        });

        botonCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validar()) {
                    Intent intent = new Intent(LoginActivity.this, ClienteActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean validar() {
        String usua = usuario.getText().toString().trim();
        String contra = contraseña.getText().toString().trim();

        if (usua.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (contra.isEmpty()) {
            Toast.makeText(this, "Ingrese contraseña", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
