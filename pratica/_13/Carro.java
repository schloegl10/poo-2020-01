package _13;

public class Carro {
    public enum Tipo {
        PASSEIOSIMPLES,
        PASSEIOLUXO,
        PASSEIOSUPERLUXO,
        UTILITARIO
    }
    private String numeroPlaca;
    private Tipo tipo;
    public Carro(String numeroPlaca, Tipo tipo) {
        setNumeroPlaca(numeroPlaca);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    private void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return "Carro{" + numeroPlaca + "," + tipo +
                '}';
    }
}
