package _13;

public class Motorista {
    private String nome;
    private String codigo;
    public enum Carteira {
        A, B, C, D
    }
    private int anosDeEmpresa;

    private Carteira carteira;

    public Motorista(String nome, String codigo, Carteira carteira) {
        this.nome = nome;
        this.codigo = codigo;
        this.carteira = carteira;
    }

    public int getAnosDeEmpresa() {
        return anosDeEmpresa;
    }

    public void setAnosDeEmpresa(int anosDeEmpresa) {
        this.anosDeEmpresa = anosDeEmpresa;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
