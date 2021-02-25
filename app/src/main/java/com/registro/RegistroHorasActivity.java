package com.registro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.MenuItem;

public class RegistroHorasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_horas);
    }
    //Hacer que if logeado se vea el la opcion de logout
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Enlace a mantenimiento
        if (item.getItemId()==R.id.opcionLogOut){
//            Intent intent=new Intent (this, MainActivity.class);
//            startActivityForResult(intent,1);
            return true;

            //Modo Noche
        }else if(item.getItemId()==R.id.nightMode){
            if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_NO){

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            return true;
        }else{

            return super.onContextItemSelected(item);
        }
    }
}