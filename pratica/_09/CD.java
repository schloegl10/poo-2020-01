package _09;

import java.util.ArrayList;
import java.util.Date;

public class CD {
    private Date lancamento;
    private String nome;
    private ArrayList<Pessoa> cantor = new ArrayList<Pessoa>();

    public CD(Date lancamento, String nome, ArrayList<Pessoa> cantor) {
        this.lancamento = lancamento;
        this.nome = nome;
        this.cantor = cantor;
    }

    @Override
    public String toString() {
        return "CD{" +
                "lancamento=" + lancamento +
                ", nome='" + nome + '\'' +
                ", cantor=" + cantor +
                '}';
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pessoa> getCantor() {
        return cantor;
    }

    public void setCantor(ArrayList<Pessoa> cantor) {
        this.cantor = cantor;
    }
    public void adicionaCantor(Pessoa cantor) {
        this.cantor.add(cantor);
    }
}
