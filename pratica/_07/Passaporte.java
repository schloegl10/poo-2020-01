package _07;

public class Passaporte {
    private String nome;
    private int numero;
    private String informacaoExtra;

    public Passaporte(String nome, int numero, String informacaoExtra) {
        this.nome = nome;
        this.numero = numero;
        this.informacaoExtra = informacaoExtra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getInformacaoExtra() {
        return informacaoExtra;
    }

    public void setInformacaoExtra(String informacaoExtra) {
        this.informacaoExtra = informacaoExtra;
    }

    @Override
    public String toString() {
        return "Passaporte{"+ getNome() + "," + getNumero() + "," + getInformacaoExtra() + "}";
    }
}
