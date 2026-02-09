package com.example.examen2trimestre;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class EstudianteActivity extends AppCompatActivity {

    private GridView gridModulos;
    private ImageView btnMenuEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        gridModulos = findViewById(R.id.gridModulos);
        btnMenuEstudiante = findViewById(R.id.btnMenuEstudiante);

        String[] modulos = {"BBDD\n1oDAM", "LDM\n1oDAM", "PROG\n1oDAM", "EED\n1oDAM", "PMDM\n2oDAM"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, modulos);
        gridModulos.setAdapter(adapter);


        registerForContextMenu(btnMenuEstudiante);


        btnMenuEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(v);
            }
        });

        Toast.makeText(this, "Bienvenido Estudiante", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Menú Estudiante");
        menu.add(0, 1, 0, "Nueva matrícula");
        menu.add(0, 2, 0, "Ver informes");
        menu.add(0, 3, 0, "Cerrar Sesión");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 1) {
            Toast.makeText(this, "Nueva matrícula", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == 2) {
            Toast.makeText(this, "Ver informes", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == 3) {
            cerrarSesion();
            return true;
        }
        return super.onContextItemSelected(item);
    }

    private void cerrarSesion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cerrar Sesión")
                .setMessage("¿Seguro que quieres salir?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(EstudianteActivity.this, MainActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}