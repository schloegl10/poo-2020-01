package _07;

public class TestaPessoa {
    public static void main(String args[]) {
        Identidade identidade = new Identidade("Felipe", 123456, "");
        Passaporte passaporte = new Passaporte("Felipe", 123456, "");
        Endereco endereco = new Endereco("Madri 17", "SN", "Jardins Madri", "Goiania");
        Pessoa eu = new Pessoa("Felipe", 1999,07,01,"marrom", "branca", "castanho", 85, 2, "Humberto", "Luciana", "Belo Horizonte", identidade, passaporte, endereco);
        System.out.println(eu);
        identidade = new Identidade("Ana", 123456, "");
        passaporte = new Passaporte("Ana", 123456, "");
        Pessoa outra = new Pessoa("Ana", 1999,07,20,"marrom", "branca", "castanho", 60, 2, "Henrique", "Luciana", "Brazilia", identidade, passaporte, endereco);
        System.out.println(outra);

    }
}
