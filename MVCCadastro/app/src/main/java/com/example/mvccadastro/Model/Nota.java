package com.example.mvccadastro.Model;

public class Nota {
    private Integer IdNota;
    private String Titulo;
    private String Txt;

    public Nota() {
    }

    public Nota(Integer idNota, String titulo, String txt) {
        IdNota = idNota;
        Titulo = titulo;
        Txt = txt;
    }

    public Nota( String titulo, String txt) {
        Titulo = titulo;
        Txt = txt;
    }

    public Integer getIdNota() {
        return IdNota;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getTxt() {
        return Txt;
    }

    public void setIdNota(Integer idNota) {
        IdNota = idNota;
    }

    public void setTitulo(String titular) {
        Titulo = titular;
    }

    public void setTxt(String txt) {
        Txt = txt;
    }
}