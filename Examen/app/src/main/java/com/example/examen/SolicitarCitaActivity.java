package com.example.examen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.examen.R;

public class SolicitarCitaActivity extends AppCompatActivity {

    private EditText nombrePerro;
    private EditText fecha;
    private RadioGroup turno;
    private Button solicitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_cita);

        initViews();
        setupListeners();
    }

    private void initViews() {
        nombrePerro = findViewById(R.id.nombrePerro);
        fecha = findViewById(R.id.fecha);
        turno = findViewById(R.id.turno);
        solicitar = findViewById(R.id.solicitar);
    }

    private void setupListeners() {
        solicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarCita();
            }
        });
    }

    private void solicitarCita() {
        String perruno = nombrePerro.getText().toString().trim();
        String fechita = fecha.getText().toString().trim();
        int id = turno.getCheckedRadioButtonId();

        if (perruno.isEmpty() || fechita.isEmpty() || id == -1) {
            Toast.makeText(this, "Mira para arriba, que te dejas algo", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton turnito = findViewById(id);
        String turno = turnito.getText().toString();

        Toast.makeText(this, "Ha salido todo perfecto", Toast.LENGTH_SHORT).show();
        finish();
    }
}