package com.javi.appmicrocuentos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 21650521 on 29/11/2017.
 */

public class CuentoApapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<Cuento> lista;

    public CuentoApapter(Context context, int idLayout, ArrayList<Cuento> lista) {
        this.context = context;
        this.idLayout = idLayout;
        this.lista = lista;
    }
    private class Item{

        TextView titulo;
        TextView avance;
    }
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Item elemento;
        if(view == null){
            view = LayoutInflater.from(context).inflate(idLayout,null);
            elemento = new Item();
            elemento.titulo = (TextView)view.findViewById(R.id.tvTitulo);
            elemento.avance = (TextView)view.findViewById(R.id.tvAvance);
            view.setTag(elemento);
        }else
            elemento = (Item) view.getTag();
            elemento.titulo.setText(lista.get(i).getTitulo());
            elemento.avance.setText(lista.get(i).getAvance());

        return view;
    }
}
