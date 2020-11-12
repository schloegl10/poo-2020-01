public class Pessoa {
    int anoNascimento;
    String nome;

    Pessoa(int anoNascimento, String nome) {
        setAnoNascimento(anoNascimento);
        setNome(nome);
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return getNome() + " (nascimento: " + getAnoNascimento() + ")";
    }
}
