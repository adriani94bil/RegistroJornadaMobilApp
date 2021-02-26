package com.registro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.registro.http.ClienteHTTPJornadasWS;

public class MainActivity extends AppCompatActivity {
    private TextView textViewRespuesta;
    private Button buttonIniciar;
    private Button buttonFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRespuesta=findViewById(R.id.textView2);
        buttonIniciar=findViewById(R.id.button);
        buttonFinalizar=findViewById(R.id.button2);
        buttonIniciar.setOnClickListener(v-> ClienteHTTPJornadasWS.iniciarJornada(textViewRespuesta,1,MainActivity.this));
        buttonFinalizar.setOnClickListener(v-> ClienteHTTPJornadasWS.finalizarJornada(textViewRespuesta,1,MainActivity.this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
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