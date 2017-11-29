package com.javi.appmicrocuentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EligeCuentoActivity extends AppCompatActivity {

    private ArrayList<Cuento> lista;
    private ListView lv;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige_cuento);
        lv = (ListView)findViewById(R.id.idLista);
        nombre = getIntent().getStringExtra("nombre");
        cargarLista();

        CuentoApapter la = new CuentoApapter(this, R.layout.activity_elige_cuento, lista);
        lv.setAdapter(la);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int i, long id) {
                Cuento itemSel = (Cuento) adapterView.getItemAtPosition(i);

            }
        });
    }
    private void cargarLista(){

        lista = new ArrayList<Cuento>();
        lista.add(new Cuento("El deseo del dinosaurio","Enfurecido, entristecido y hambriento..."
                , "Enfurecido, entristecido y hambriento, porque el T-Rex le había robado la presa que había casado, %s el velociraptor, al ver una estrella fugaz surcar los cielos en dirección a la tierra,  deseó, lleno de odio, que el mundo se acabara y que todos se extinguieran."));
        lista.add(new Cuento("Amores fugaces","Cuando se fue a la cama...","Cuando %s se fue a la cama, " +
                "a pesar de haber tenido una día largo y complicado, recordó la efímera sonrisa " +
                "que le dedicó aquel desconocido que se cruzó en su camino y, olvidándose de " +
                "todo, se quedó dormido con una gran sonrisa en los labios."));
        lista.add(new Cuento("El deseo de cumpleaños","Mientras le cantaban el cumpleaños...",
                "Mientras le cantaban el cumpleaños, %s cerró fuertemente los ojos y se concentró" +
                        " en pedir su deseo con todas sus fuerzas y, cuando finalmente " +
                        "sopló las velitas, de la nada, se materializó un pony rosado que" +
                        " cayó sobre el pastel, salpicando a todos los presentes."));
    }
}
