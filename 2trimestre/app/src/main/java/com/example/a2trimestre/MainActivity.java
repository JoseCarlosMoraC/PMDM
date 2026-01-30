package com.example.a2trimestre;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i("menus", item.toString());
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuelemento, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        Log.i("menus", item.toString());
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

/*
        String[] opciones = {
                "Yakuza 0",
                "Yakuza Kiwami",
                "Yakuza Kiwami 2",
                "Yakuza 3",
                "Yakuza 4",
                "Yakuza 5",
                "Yakuza 6",
                "Yakuza: Like a Dragon",
                "Like a Dragon: The Man Who Erased His Name",
                "Yakuza Like a Dragon: Infinite Weatlh"
        };

        AutoCompleteTextView textoLeido =
                (AutoCompleteTextView) findViewById(R.id.miTexto);
        ArrayAdapter<String> adapador =
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_dropdown_item_1line,
                        opciones
                );
        textoLeido.setAdapter(adapador);

        TextView elemento = (TextView) findViewById(R.id.texto);
        registerForContextMenu(elemento);
*/
        Datos[] datos = new Datos[]{
                new Datos("Linea superior 1", "Linea inferior 1"),
                new Datos("Linea superior 2", "Linea inferior 2"),
                new Datos("Linea superior 3", "Linea inferior 3"),
                new Datos("Linea superior 4", "Linea inferior 4"),
                new Datos("Linea superior 5", "Linea inferior 5")
        };

        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador miAdaptador = new Adaptador(this, datos);
        listado.setAdapter(miAdaptador);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Pulsado", "Elemento pulsado: " + position);
                Log.i("Pulsado", "Elemento pulsado: " +
                        (Datos) parent.getItemAtPosition(position));
            }
        });

/*
        SeekBar miControl = (SeekBar) findViewById(R.id.miSeekBar);
        miControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("MiSeekBar", "Valor progreso:" + seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("MiseekBar", "Valor final de:" + seekBar.getProgress());
            }
        });

            RatingBar controlRating =  (RatingBar) findViewById(R.id.myRating);
            controlRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Log.i("Rating","Valor de rating: "+rating);
                }
            });

        ListView listado = (ListView) findViewById(R.id.miLista);
        final String[] datos = new String[]{"Yakuza 0", "Yakuza Kinawi", "Yakuza Kinawi 2 ", "Yakuza 3", "Yakuza 4", "Yakuza 5","Yakuza 6","Yakuza: Like a Dragon", "Like a Dragon: The Man Who Erased His Name", "Yakuza Like a Dragon: Infinite Weatlh"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datos);
        listado.setAdapter(adaptador);


        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Pulsado", "Elemento pulsado: "+position);
                Log.i("Pulsado", "Elemento pulsado: "+(String) parent.getItemAtPosition(position));
            }
        });

        GridView listado = (GridView) findViewById(R.id.miGrid);
        final String[] datos = new String[]{"Yakuza 0", "Yakuza Kinawi", "Yakuza Kinawi 2", "Yakuza 3", "Yakuza 4", "Yakuza 5","Yakuza 6","Yakuza: Like a Dragon", "Like a Dragon: The Man Who Erased His Name", "Yakuza Like a Dragon: Infinite Weatlh" };
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datos);
        listado.setAdapter(adaptador);




        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Pulsado", "Elemento pulsado: "+position);
                Log.i("Pulsado", "Elemento pulsado: "+(String) parent.getItemAtPosition(position));
            }
        });
  */

    }
}
