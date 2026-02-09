package com.example.examen2trimestre;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class DocenteActivity extends AppCompatActivity {

    private ListView listaEstudiantes;
    private ImageView btnMenuDocente;
    private Button btnAnadir;
    private static final String CHANNEL_ID = "canal_docente";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente);

        listaEstudiantes = findViewById(R.id.listaEstudiantes);
        btnMenuDocente = findViewById(R.id.btnMenuDocente);
        btnAnadir = findViewById(R.id.btnAnadir);

        crearCanal();

        String[] estudiantes = {"Manuel Parrado\n2ºDAM", "Ángela Chica\n2ºDAM", "Antonio José Rendón\n2ºDAM", "Adrián Solís\n2ºDAM", "JC Mora\n2ºDAM"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, estudiantes);
        listaEstudiantes.setAdapter(adapter);


        registerForContextMenu(btnMenuDocente);


        btnMenuDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(v);
            }
        });

        btnAnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogo();
            }
        });

        Toast.makeText(this, "Bienvenido Docente", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Menú Docente");
        menu.add(0, 1, 0, "Añadir estudiante");
        menu.add(0, 2, 0, "Ver informes");
        menu.add(0, 3, 0, "Cerrar Sesión");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 1) {
            mostrarDialogo();
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

    private void mostrarDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Añadir Estudiante")
                .setMessage("¿Confirmar nuevo estudiante?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        lanzarNotificacion();
                        Toast.makeText(DocenteActivity.this, "Estudiante añadido", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    private void cerrarSesion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cerrar Sesión")
                .setMessage("¿Seguro que quieres salir?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(DocenteActivity.this, MainActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    private void crearCanal() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Docente", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }

    private void lanzarNotificacion() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Estudiante Añadido")
                .setContentText("Nuevo estudiante registrado")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        NotificationManagerCompat.from(this).notify(101, builder.build());
    }
}