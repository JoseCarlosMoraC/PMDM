package com.example.proyecto1;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgDias;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        rgDias = findViewById(R.id.rgDias);
        tvResultado = findViewById(R.id.tvResultado);

        // Evento cuando se selecciona un día
        rgDias.setOnCheckedChangeListener((group, checkedId) -> {

            RadioButton rbSeleccionado = findViewById(checkedId);
            String dia = rbSeleccionado.getText().toString();

            tvResultado.setText("Has seleccionado: " + dia);
        });
    }
}
