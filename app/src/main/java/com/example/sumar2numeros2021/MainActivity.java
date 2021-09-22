package com.example.sumar2numeros2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String ETIQUETA = "SUMARP";
    EditText numero1;
/*
Para los métodos de la clase heredada puedo usar Ctrol+O para hacerlo de manera automática.
* */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ETIQUETA, "Mi actividad se ha parado");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(ETIQUETA, "Mi actividad se ha resumido");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ETIQUETA, "Mi actividad se ha destruido");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSumar = findViewById(R.id.botonSumar);
        Button restar = findViewById(R.id.buttonRestar);
        numero1 = findViewById(R.id.editTextNumber);
        EditText numero2 = findViewById(R.id.editTextNumber2);
        TextView resultado = findViewById(R.id.textView);
/*
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int suma = n1 + n2;
                resultado.setText("La suma de "+n1+" + "+n2 +" = "+suma);
            }
        });
*/
        botonSumar.setOnClickListener(this);
        restar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        EditText numero1 = findViewById(R.id.editTextNumber);
        EditText numero2 = findViewById(R.id.editTextNumber2);
        TextView resultado = findViewById(R.id.textView);
        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        int resultadoCuenta = 0;
        String operador = "";
        switch (view.getId()) {
            case R.id.botonSumar:
                resultadoCuenta = n1 + n2;
                operador = "+";
                break;
            case R.id.buttonRestar:
                resultadoCuenta = n1 - n2;
                operador = "-";
        }

        resultado.setText("La operacion: " + operador + " de " + n1 + " y " + n2 + " es " + resultadoCuenta);

    }
}