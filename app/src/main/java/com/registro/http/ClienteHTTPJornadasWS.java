package com.registro.http;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClienteHTTPJornadasWS {
    private static String urlIniciar="http://10.0.2.2:8080/RegistroJornada/webresources/jornadas/iniciarJornada/usuario";
    private static String urlFinalizar="http://10.0.2.2:8080/RegistroJornada/webresources/jornadas/finalizarJornada/usuario";


    public static void iniciarJornada(TextView resultado, int idEmpleado, Context context){
        String url=urlIniciar+"/"+idEmpleado;
        JsonObjectRequest peticion= new JsonObjectRequest(
        Request.Method.GET,
                url,
                null,
                response->{resultado.setText("Jornada Iniciada");
                },
                error->{
                    resultado.setText("No se pudo iniciar la Jornada " + error.getMessage());
                }
        );
        ColaPeticionesSingletone.getInstance(context).getRequestQueue().add(peticion);
    }

    public static void finalizarJornada(TextView result, int idEmpleado,Context context){
        String urlfin=urlFinalizar+"/"+idEmpleado;

        JsonObjectRequest peticion= new JsonObjectRequest(
                Request.Method.GET,
                urlfin,
                null,
                response -> {
                    result.setText("Jornada finalizada");
                    },
                error -> {
                    result.setText(" No se ha podido finalizar la Jornada"+error.getMessage());
                }
        );
        ColaPeticionesSingletone.getInstance(context).getRequestQueue().add(peticion);

    }



}
