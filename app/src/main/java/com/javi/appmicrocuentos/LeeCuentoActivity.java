package com.javi.appmicrocuentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LeeCuentoActivity extends AppCompatActivity {
    TextView tvTitulo;
    TextView tvTexto;
    String nombre;
    String titulo;
    String texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lee_cuento);
        tvTitulo = (TextView)findViewById(R.id.tvTitulo);
        tvTexto = (TextView)findViewById(R.id.tvTexto);
        nombre = getIntent().getStringExtra("nombre");
        titulo = getIntent().getStringExtra("titulo");
        texto = String.format(getIntent().getStringExtra("texto"),nombre);

        tvTitulo.setText(titulo);
        tvTexto.setText(texto);
    }
}
