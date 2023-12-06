package com.example.mvccadastro.Controller;

import android.content.Context;

import com.example.mvccadastro.Model.Nota;
import com.example.mvccadastro.Model.NotaDAO;

import java.util.ArrayList;

public class NotaController {
    Context _context;
    NotaDAO _nDAO;

    public NotaController(Context _context) {
        this._context = _context;
        this._nDAO = new NotaDAO(this._context);
    }

    public void cadastrarNovaNota(Nota nota){
        _nDAO.cadastrarNovaNota(nota);
    }
    public void atualizarNota(Nota nota){
        _nDAO.atualizarNota(nota);
    }

    public void excluirNota(Nota nota){
        _nDAO.excluirNota(nota);
    }
    public void getNota(Integer id){
        _nDAO.getNota(id);
    }

    public ArrayList<Nota> getListaNotas(){
        return _nDAO.getListaNotas();
    }

}
