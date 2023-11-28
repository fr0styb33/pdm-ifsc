package com.example.listagemchurras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<listaAnimais> animaizinhos = new ArrayList<listaAnimais>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        animaizinhos.add(new listaAnimais("Cachorro"));
        animaizinhos.add(new listaAnimais("Gato"));
        animaizinhos.add(new listaAnimais("Coelho"));
        animaizinhos.add(new listaAnimais("Peixe"));
        animaizinhos.add(new listaAnimais("Papagaio"));
        animaizinhos.add(new listaAnimais("Hamster"));
        animaizinhos.add(new listaAnimais("Porco"));
        animaizinhos.add(new listaAnimais("Macaco"));
        animaizinhos.add(new listaAnimais("Porquinho da India"));

        listaAnimaizinhosAdapter adapter = new listaAnimaizinhosAdapter(this, R.layout.lista_animaizinhos_layout, animaizinhos);
        listView.setAdapter(adapter);


    }
}