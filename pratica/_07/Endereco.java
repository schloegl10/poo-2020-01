package _07;

public class Endereco {
    private String rua;
    private String numero;
    private String setor;
    private String complemento;

    public Endereco(String rua, String numero, String setor, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.setor = setor;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + rua + ',' + numero + setor + ',' + complemento + '}';
    }
}
