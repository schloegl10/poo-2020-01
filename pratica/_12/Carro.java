package _12;

public class Carro {
    private String numeroPlaca;

    public Carro(String numeroPlaca) {
        setNumeroPlaca(numeroPlaca);
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    private void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPlaca='" + numeroPlaca + '\'' +
                '}';
    }
}
