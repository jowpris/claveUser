package com.example.dptoredes.appjoel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.btnNext);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              abrirAcercaDe();
           }
        });

    }


    public void abrirAcercaDe( ) {
        Intent intent = new Intent(this, AcercaDe.class);
        TextView x= (TextView) (findViewById(R.id.txtUser));
        TextView y= (TextView) (findViewById(R.id.txtPass));

        intent.putExtra("usuario", "" + x.getText());
        intent.putExtra("clave", "" + y.getText());
        //Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:962849347"));
        //  startActivity(intent);
        startActivity(intent);

    }


}