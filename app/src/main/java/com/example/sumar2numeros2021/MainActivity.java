package com.example.sumar2numeros2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSumar = findViewById(R.id.botonSumar);
        EditText numero1 = findViewById(R.id.editTextNumber);
        EditText numero2 = findViewById(R.id.editTextNumber2);
        TextView resultado = findViewById(R.id.textView);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int suma = n1 + n2;
                resultado.setText("La suma de "+n1+" + "+n2 +" = "+suma);
            }
        });



    }
}