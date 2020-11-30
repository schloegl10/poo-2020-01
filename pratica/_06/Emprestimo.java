package _06;

import java.util.Date;

public class Emprestimo {
    Livro livro;
    Pessoa funcionario;
    Pessoa usuario;
    Date data;
    int quantidade;

    public Emprestimo(Livro livro, Pessoa funcionario, Pessoa usuario, Date data, int quantidade) {
        this.livro = livro;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.data = data;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Emprestimo{\n" +
                "livro=" + livro +
                ", \nfuncionario=" + funcionario +
                ", \nusuario=" + usuario +
                ", \ndata=" + data +
                ", \nquantidade=" + quantidade +
                "\n}";
    }
}
