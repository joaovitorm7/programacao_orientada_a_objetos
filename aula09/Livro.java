package aula09;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;

    public void exibirDetalhes(String tituloLivro, String autorLivro, int anoPublicacaoLivro){
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.anoPublicacao = anoPublicacaoLivro;
    } 
    public void emprestrar(){
        boolean disponivel = false;
    }
    public void devolver(){
        boolean disponivel = true;
    }
}
