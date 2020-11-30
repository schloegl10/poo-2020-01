package _08;

public class TestaPessoa {
    public static void main(String args[]) {
        Pessoa joao = new Pessoa("João da Silva");
        Pessoa maria = new Pessoa("Maria de Jesus");
        System.out.println(joao);
        System.out.println(maria);
        maria.setNome(joao.getNome());
        System.out.println(joao);
        System.out.println(maria);
    }
}
