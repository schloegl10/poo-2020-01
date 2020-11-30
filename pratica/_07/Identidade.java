package _07;

public class Identidade {
    private String nome;
    private int numeroRG;
    private String dadosExtras;

    public Identidade(String nome, int numeroRG, String dadosExtras) {
        this.nome = nome;
        this.numeroRG = numeroRG;
        this.dadosExtras = dadosExtras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(int numeroRG) {
        this.numeroRG = numeroRG;
    }

    public String getDadosExtras() {
        return dadosExtras;
    }

    public void setDadosExtras(String dadosExtras) {
        this.dadosExtras = dadosExtras;
    }

    @Override
    public String toString() {
        return "Identidade{" + getNome() + "," + getNumeroRG() + "," + getDadosExtras() + "}";
    }
}
