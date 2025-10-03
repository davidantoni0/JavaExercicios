package orientacaoAObjetos.SistemaBiblioteca;

public class Programa {
    public static void main(String[] args) {
        Autor autor = new Autor( "Machado de Assis", "Brasileira");
        Livro livro = new Livro( "Dom Casmurro", 1899, autor);

        System.out.println("Título: " + livro.titulo + ", Ano de Publicação: " + livro.anoPublicacao + ", Autor: " + livro.autor.nome + ", Nacionalidade: " + livro.autor.nacionalidade);
    }
    
}
