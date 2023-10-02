package com.example.listaanimais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<ItemAnimais> animais = new ArrayList<ItemAnimais>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        animais.add(new ItemAnimais(0, "Nome", "Nome Científico",R.drawable.animaizinhos));
        animais.add(new ItemAnimais(1, "Cachorro", "Canis lupus familiaris",R.drawable.cachorro));
        animais.add(new ItemAnimais(2, "Gato", "Felis catus", R.drawable.gato));
        animais.add(new ItemAnimais(3, "Coelho", "Lagomorpha",  R.drawable.coelho));
        animais.add(new ItemAnimais(4, "Hamster", "Cricetinae", R.drawable.hamster));
        animais.add(new ItemAnimais(5, "Porquinho da india", "Cavia porcellus", R.drawable.porquinhodaindia));
        animais.add(new ItemAnimais(6, "Peixe", "Chondrichthyes", R.drawable.peixe));
        animais.add(new ItemAnimais(7, "Pássaro", "Aves", R.drawable.passaro));
        animais.add(new ItemAnimais(8, "Porco", "Sus scrofa domesticus", R.drawable.porco));
        animais.add(new ItemAnimais(9, "Lontra", "Lutrinae", R.drawable.lontra));
        animais.add(new ItemAnimais(10, "Macaco", "Primates",  R.drawable.macaco));
        animais.add(new ItemAnimais(9, "Tartaruga", "Testudines", R.drawable.tartaruga));
        animais.add(new ItemAnimais(10, "Camaleão", "Chamaeleonidae",  R.drawable.camaleao));

        ItemAnimalAdapter adapter = new ItemAnimalAdapter(this, R.layout.animais_item_layout, animais);
        listView.setAdapter(adapter);
    }
}