package _06;

import java.util.Date;

public class TestaEmprestimo {
    public static void main(String args[]) {
        Pessoa autor = new Pessoa("Don John", 2020);
        Editora editora = new Editora("Editora 123", "Rua 123");
        Livro livroEmprestado = new Livro("Livro Teste", autor, 2020, editora);
        Pessoa cliente = new Pessoa("João Maria", 2020);
        Pessoa funcionario = new Pessoa("Maria João", 1920);
        Emprestimo emprestimoLivro = new Emprestimo(livroEmprestado, funcionario, cliente, new Date(), 1);
        System.out.println(emprestimoLivro.toString());

    }
}
