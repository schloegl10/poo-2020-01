public class Livro {
    private String titulo;
    private String editora;
    private int ano;
    private String autor;

    Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.autor = autor;
    }
     
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" 
               + getEditora() + ", "+ getAno();
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditora() {
        return editora;
    }
    public String getTitulo() {
        return titulo;
    }
}
