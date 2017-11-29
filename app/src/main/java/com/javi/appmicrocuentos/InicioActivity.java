package com.javi.appmicrocuentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {
EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        nombre = (EditText)findViewById(R.id.etNombre);
    }

    public void continuar(View v){
        if(nombre.getText().length()==0){
            Toast.makeText(this, getResources().getString(R.string.nombreVacio), Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(InicioActivity.this,EligeCuentoActivity.class);
            intent.putExtra("nombre",nombre.getText().toString());
            startActivity(intent);
        }
    }
}
