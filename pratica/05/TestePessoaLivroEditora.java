public class TestePessoaLivroEditora {
    public static void main(String arg[]) {
        Pessoa pessoa = new Pessoa(1596 ,"René Descartes");
        Editora editora = new Editora("Martin Claret", "Rua Alegrete, 62, Bairro Sumaré");
        Livro livro = new Livro("Discurso do Método", pessoa, 2002, editora);
        System.out.println(livro);
    }
}