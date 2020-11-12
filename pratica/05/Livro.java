public class Livro {
    private String titulo;
    private Editora editora;
    private int ano;
    private Pessoa autor;

    Livro(String titulo, Pessoa autor, int ano, Editora editora) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }
    public Pessoa getAutor() {
        return autor;
    }
    public Editora getEditora() {
        return editora;
    }
    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return getTitulo() + "\n" + getAutor().toString() + "\n"
               + getEditora().getNome() + ", " + getAno() + "\n"
               + getEditora().getLocal();
    }
}
