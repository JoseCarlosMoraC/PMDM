package com.example.coachx_appfinal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;
    private TextView tvError;
    private TextView tvOlvidoContrasena;

    // Credenciales hardcoded por rol
    private static final String EMAIL_ENTRENADOR    = "jcmora@gmail.com";
    private static final String EMAIL_COORDINADOR   = "antoniopolo@gmail.com";
    private static final String EMAIL_DELEGADO      = "emiliosanchez@gmail.com";
    private static final String PASSWORD_COMUN      = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail             = findViewById(R.id.etEmail);
        etPassword          = findViewById(R.id.etPassword);
        btnLogin            = findViewById(R.id.btnLogin);
        tvError             = findViewById(R.id.tvErrorLogin);
        tvOlvidoContrasena  = findViewById(R.id.tvOlvidoContrasena);

        btnLogin.setOnClickListener(v -> intentarLogin());

        tvOlvidoContrasena.setOnClickListener(v ->
                Toast.makeText(this, "Recuperar contraseña - Próximamente", Toast.LENGTH_SHORT).show()
        );
    }

    private void intentarLogin() {
        String email    = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validaciones básicas
        if (TextUtils.isEmpty(email)) {
            mostrarError("Introduce tu correo electrónico");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mostrarError("Introduce tu contraseña");
            return;
        }

        // Comprobar credenciales
        if (!password.equals(PASSWORD_COMUN)) {
            mostrarError("Contraseña incorrecta");
            return;
        }

        Intent intent;

        if (email.equalsIgnoreCase(EMAIL_ENTRENADOR)) {
            intent = new Intent(LoginActivity.this, EntrenadorDashboardActivity.class);
        } else if (email.equalsIgnoreCase(EMAIL_COORDINADOR)) {
            intent = new Intent(LoginActivity.this, CoordinadorDashboardActivity.class);
        } else if (email.equalsIgnoreCase(EMAIL_DELEGADO)) {
            intent = new Intent(LoginActivity.this, DelegadoDashboardActivity.class);
        } else {
            mostrarError("Usuario no encontrado");
            return;
        }

        ocultarError();
        startActivity(intent);
        finish(); // No se puede volver al login con el botón atrás
    }

    private void mostrarError(String mensaje) {
        tvError.setText(mensaje);
        tvError.setVisibility(View.VISIBLE);
    }

    private void ocultarError() {
        tvError.setVisibility(View.GONE);
    }
}
