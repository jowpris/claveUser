package com.example.dptoredes.appjoel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        TextView clave= (TextView)(findViewById(R.id.textViewP));
        TextView usuario= (TextView)(findViewById(R.id.textViewU));

        usuario.setText((String)getIntent().getExtras().get("usuario"));
        clave.setText((String)getIntent().getExtras().get("clave"));

    }
}
