package com.example.listagemchurras;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

public class listaAnimaizinhosAdapter extends ArrayAdapter<listaAnimais> {
    Context context;
    int resource;

    List<listaAnimais> objects;

    public listaAnimaizinhosAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

}
