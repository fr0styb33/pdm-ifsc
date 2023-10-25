package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    ListView listView;

    Button btn;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("meubd",MODE_PRIVATE, null);

        db.execSQL("CREATE TALBE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo VARCHAR, txt var)");

        ContentValues cv = new ContentValues();
        cv.put("titulo", "Nome");
        db.insert("notas", null, cv);

        btn.setOnClickLitener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                insereNota();
            }
        });

        public void insereNota(){
            ContentValues cv = new ContentValues();
            cv.put("titulo", editText.getText().toString());
            db.insert("notas", null, cv);
        }

        Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
        cursor.moveToFirst();

        ArrayList<String> listaNotas = new ArrayList<>();
        while(!cursor.isAfterLast()){
            listaNotas.add(cursor.getString(cursor.getColumnIndex("titulo")));

        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.sim)
    }
}