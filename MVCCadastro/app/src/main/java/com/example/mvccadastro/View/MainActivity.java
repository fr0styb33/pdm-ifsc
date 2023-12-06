package com.example.mvccadastro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.mvccadastro.Controller.NotaController;
import com.example.mvccadastro.Model.Nota;
import com.example.mvccadastro.R;
import com.example.mvccadastro.Controller.NotaController;
import com.example.mvccadastro.Model.Nota;
import com.example.mvccadastro.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Button btn;
    Button btnExcluir;
    Button btnLimpar;
    EditText titulo;
    EditText texto;

    ArrayList<Nota> lista = new ArrayList<Nota>();
    NotaArrayAdpter adpter;
    NotaController _controller;

    Nota notaClick;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listV);
        btn = findViewById(R.id.button);
        texto = findViewById(R.id.NTexto);
        titulo = findViewById(R.id.Ntitulo);
        btnExcluir = findViewById(R.id.exluir);
        btnLimpar = findViewById(R.id.buttonLimpar);

        _controller = new NotaController(this);
        listagem();


    }

    public void listagem(){
        lista = _controller.getListaNotas();
        adpter = new NotaArrayAdpter(this, R.layout.activity_list_item, lista);
        lv.setAdapter(adpter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0; i < parent.getChildCount(); i++) {
                    View listItem = parent.getChildAt(i);
                    listItem.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                }

                Nota notaClicada = lista.get(position);
                notaClick = notaClicada;
                titulo.setText(notaClick.getTitulo());
                texto.setText(notaClick.getTxt());


                view.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
        });

    }


    public void cadastrar(View v){
        if (!titulo.getText().toString().equals("") && !texto.getText().toString().equals("")){
            _controller.cadastrarNovaNota(new Nota(titulo.getText().toString(), texto.getText().toString()));
            listagem();
        }
    }

    public void excluir(View v){
        _controller.excluirNota(notaClick);
        listagem();
    }

    public void alterar(View v){
        String txtTitulo = titulo.getText().toString();
        String txtTexto = texto.getText().toString();

        if (!txtTitulo.equals("") || !txtTexto.equals("")){
            if (!txtTitulo.equals("")){
                notaClick.setTitulo(txtTitulo);
            }
            if (!txtTexto.equals("")){
                notaClick.setTxt(txtTexto);
            }
            _controller.atualizarNota(notaClick);
            listagem();
        }
    }

    public void limpar(View v) {
        notaClick = new Nota();
        titulo.setText("");
        texto.setText("");
        if (lv != null) {
            for (int i = 0; i < lv.getChildCount(); i++) {
                View listItem = lv.getChildAt(i);
                listItem.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            }
        }
    }








}