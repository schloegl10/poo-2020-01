package _11;

public class TestaPessoaTelefone {
    public static void main(String args[]) {
        Pessoa pessoa = new Pessoa("Nome");
        Telefone telefone1 = new Telefone("12345678");
        Telefone telefone2 = new Telefone("22345678");
        Telefone telefone3 = new Telefone("32345678");
        Telefone telefone4 = new Telefone("42345678");
        Telefone telefone5 = new Telefone("52345678");
        pessoa.adicionaTelefone(telefone1);
        pessoa.adicionaTelefone(telefone2);
        pessoa.adicionaTelefone(telefone3);
        pessoa.adicionaTelefone(telefone4);
        pessoa.adicionaTelefone(telefone5);
        System.out.println(pessoa);
        pessoa.adicionaTelefone(telefone1);
        System.out.println(pessoa);
        pessoa.removeTelefone(telefone1);
        System.out.println(pessoa);
    }
}
