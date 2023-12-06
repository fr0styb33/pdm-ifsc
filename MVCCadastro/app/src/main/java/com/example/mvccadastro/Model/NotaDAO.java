package com.example.mvccadastro.Model;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

import java.util.ArrayList;

public class NotaDAO {
    SQLiteDatabase sqlLitedb;

    public NotaDAO(Context c) {
        sqlLitedb = c.openOrCreateDatabase("dbNota", MODE_PRIVATE, null);
        sqlLitedb.execSQL("CREATE TABLE IF NOT EXISTS nota(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " titulo VARCHAR," +
                " texto VARCHAR);");
    }

    public void cadastrarNovaNota(Nota nota){
        ContentValues cv = new ContentValues();
        cv.put("titulo", nota.getTitulo());
        cv.put("texto", nota.getTxt());
        sqlLitedb.insert("nota", null,  cv);
    }
    public void atualizarNota(Nota nota){
        ContentValues cv = new ContentValues();
        cv.put("titulo", nota.getTitulo());
        cv.put("texto", nota.getTxt());
        sqlLitedb.update("nota", cv, "id = ?", new String[]{String.valueOf(nota.getIdNota())});

    }

    public void  excluirNota(Nota nota){
        sqlLitedb.delete("nota", "id = ?", new String[]{String.valueOf(nota.getIdNota())});
    }
    public Nota getNota(Integer id){
        String sql="SELECT * FROM nota WHERE id = ?";
        Cursor cv = sqlLitedb.rawQuery(sql, new String[]{String.valueOf(id)});
        //Recupenado um registro relacionado e convertendo para objeto Nota
        cv.moveToFirst();
        @SuppressLint("Range") Nota nota = new Nota(cv.getInt(cv.getColumnIndex("id")), cv.getString(cv.getColumnIndex("titulo")), cv.getString(cv.getColumnIndex("txt")));
        return nota;
    }

    @SuppressLint("Range")
    public ArrayList<Nota> getListaNotas(){
        Cursor cursor = sqlLitedb.rawQuery("SELECT * FROM nota", null);
        cursor.moveToFirst();

        ArrayList<Nota> notas = new ArrayList<>();
        while (!cursor.isAfterLast()){

            notas.add( new Nota(cursor.getInt(cursor.getColumnIndex("id")),
                    cursor.getString(cursor.getColumnIndex("titulo")),
                    cursor.getString(cursor.getColumnIndex("texto"))));
            cursor.moveToNext();
        }

        return notas;
    }
}