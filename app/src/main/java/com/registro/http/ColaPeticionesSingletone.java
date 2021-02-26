package com.registro.http;


import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

// SINGLETON- UNA SOLA INSTANCIA PARA TODA LA PETICION
public class ColaPeticionesSingletone {

    //ATRIBUTOS

    private static com.registro.http.ColaPeticionesSingletone instancia;
    private static RequestQueue requestQueue;


    //COSNTRUCTOR
    private ColaPeticionesSingletone(Context ctx){
        requestQueue = Volley.newRequestQueue(ctx);
    }

    public synchronized static com.registro.http.ColaPeticionesSingletone getInstance(Context context) {
        if (instancia==null){
            instancia=new com.registro.http.ColaPeticionesSingletone(context);
        }
        return instancia;
    }

    public RequestQueue getRequestQueue(){
        return requestQueue;
    }
}
