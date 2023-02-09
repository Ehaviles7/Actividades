package com.example.rentasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaramos los objetos en la clase

    EditText Nombre, Monto, Descripcion;

    Button Calcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Establecemos las referencias

        Nombre = findViewById(R.id.etNombre);
        Monto = findViewById(R.id.etMonto);
        Descripcion = findViewById(R.id.etDescri);
        Calcu = findViewById(R.id.btCalcular);

        Calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcu();
            }
        });
    }

    public void calcu(){
        try {

            int Mon = 0;
            String Nom, Des;
            Nom = Nombre.getText().toString();
            Des = Descripcion.getText().toString();

            
            if (Monto.getText().toString().equals("")){
                Toast.makeText(this, "Hey, ponga los datos bien", Toast.LENGTH_LONG);
            }else {

                Mon = ((Integer.parseInt(Monto.getText().toString()) / 100) * 90);


                Intent Otra = new Intent(MainActivity.this, renta2.class);
                Otra.putExtra("No", Nom);
                Otra.putExtra("Mo", Mon);
                Otra.putExtra("De", Des);
                startActivity(Otra);
                finish();
            }
        }catch (Exception error){
            Log.e("MainActivity", error.getMessage());
        }
    }


}