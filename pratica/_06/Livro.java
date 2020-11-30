package _06;
public class Livro {
    String titulo;
    Pessoa autor;
    int ano;
    Editora editora;

    public Livro(String titulo, Pessoa autor, int ano, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", ano=" + ano +
                ", editora=" + editora +
                '}';
    }
}