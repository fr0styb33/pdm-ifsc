package com.example.mvccadastro.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mvccadastro.Model.Nota;
import com.example.mvccadastro.R;

import java.util.List;

public class NotaArrayAdpter extends ArrayAdapter<Nota> {

    Context MyContext;
    int MyResource;

    public NotaArrayAdpter(@NonNull Context context, int resource, @NonNull List<Nota> objects) {
        super(context, resource, objects);
        MyContext = context;
        MyResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //infla o layout
        LayoutInflater inflater = LayoutInflater.from(MyContext);
        convertView  = inflater.inflate(MyResource, parent, false);

        //return super.getView(position, convertView, parent);
        TextView txtiid = convertView.findViewById(R.id.txtid);
        TextView txtTitulo = convertView.findViewById(R.id.txttitulo);
        TextView txtTxt = convertView.findViewById(R.id.txttxt);


        txtTitulo.setText(getItem(position).getTitulo());
        txtiid.setText(String.valueOf(getItem(position).getIdNota()));
        txtTxt.setText(getItem(position).getTxt());
        return convertView;
    }
}