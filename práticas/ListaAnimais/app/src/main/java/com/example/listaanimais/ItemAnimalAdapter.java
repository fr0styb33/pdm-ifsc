package com.example.listaanimais;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAnimalAdapter extends ArrayAdapter<ItemAnimais> {
    Context context;
    int resource;
    List<ItemAnimais> objects;

    public ItemAnimalAdapter(@NonNull Context context, int resource, @NonNull List<ItemAnimais> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.animais_item_layout, parent, false);
        }

        ImageView foto = convertView.findViewById(R.id.foto);
        foto.setImageResource(objects.get(position).foto);

        TextView nome = convertView.findViewById(R.id.nome);
        nome.setText(objects.get(position).nome);

        TextView nomeCientifico = convertView.findViewById(R.id.nomeCientifico);
        nomeCientifico.setText(objects.get(position).nomeCientifico);

        return convertView;
    }
}
