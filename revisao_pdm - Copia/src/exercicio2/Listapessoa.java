package exercicio2;

import java.util.ArrayList;

public class Listapessoa {
    private ArrayList<Pessoa> listaP;

    
    public Listapessoa() {
        listaP = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa) {
        listaP.add(pessoa);
    }
    public ArrayList<Pessoa> getListaPessoa() {
        return listaP;
    }
}

