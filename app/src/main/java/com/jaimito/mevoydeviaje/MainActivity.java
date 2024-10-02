package com.jaimito.mevoydeviaje;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnInfo;
    RadioGroup rdgDestino, rdgTransporte;
    RadioButton rdbParis, rdbLondres, rdbRoma, rdbCoche, rdbTren, rdbAvion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnInfo = findViewById(R.id.btnInfo);
        rdgDestino = findViewById(R.id.rdgDestino);
        rdgTransporte = findViewById(R.id.rdgTransporte);
        rdbParis = findViewById(R.id.rdbParis);
        rdbLondres = findViewById(R.id.rdbLondres);
        rdbRoma = findViewById(R.id.rdbRoma);
        rdbCoche = findViewById(R.id.rdbCoche);
        rdbTren = findViewById(R.id.rdbTren);
        rdbAvion = findViewById(R.id.rdbAvion);

        btnInfo.setOnClickListener(view -> displayInfo());
    }

    private void displayInfo() {
        String mensaje = "Me voy a " + getDestino() + " en " + getTransporte();
        Toast toastInfo = Toast.makeText(this, mensaje, Toast.LENGTH_LONG);
        toastInfo.show();
    }

    private String getDestino() {
        String destino = "";
        int id = rdgDestino.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton radioButton = findViewById(id);
            destino = radioButton.getText().toString();
        }

        return destino;
    }

    private String getTransporte() {
        String transporte = "";
        int id = rdgTransporte.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton radioButton = findViewById(id);
            transporte = radioButton.getText().toString();
        }
        return transporte;
    }

}