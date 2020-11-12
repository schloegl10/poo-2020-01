public class Editora {
    String nome;
    String endereco;
    Editora(String nome, String endereco) {
        setEndereco(endereco);
        setNome(nome);
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return getNome() + "\n" + getEndereco();
    }
}
