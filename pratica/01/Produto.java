public class Produto {
    private String descricao;
    private float preco;
    private float aliquota;

    public float getPreco() {
        return this.preco*(1+aliquota);
    }
}
