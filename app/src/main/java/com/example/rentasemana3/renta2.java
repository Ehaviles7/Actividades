package com.example.rentasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class renta2 extends AppCompatActivity {

    //Declarar objetos en la clase

    TextView Renta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renta2);

        //Referencias
        Renta = findViewById(R.id.tvRenta);


    }

    @Override
    protected void onResume() {
        super.onResume();

        Bundle Datos = getIntent().getExtras();
        if (Datos != null){

            String nombre = Datos.getString("No");

            int laRenta = Datos.getInt("Mo");

            Renta.setText("Estimado " + nombre + " su sueldo liquido es de:\n\n " + laRenta);
        }
    }
}