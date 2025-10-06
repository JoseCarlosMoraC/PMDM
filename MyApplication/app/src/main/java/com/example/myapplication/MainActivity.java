package com.example.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
  /*      int permissionCheck = ContextCompat.checkSelfPermission(thisActivity, Manifest.permission.CAMERA);

        public void onRequestPermissionsResult(int requestCode, String permissions[], int[] granResults){
            switch(requestCode){
                case MY_PERMISSIONS_CAMERA: {
                    if(granResults.length > 0 && granResults[0] ==PackageManager.PERMISSION_GRANTED)
                    {
                        //Codigo de permiso aceptado
                    }else{
                         //Codigo de permiso denegado
                    }
                }
                return;
            }*/
        }
    }
