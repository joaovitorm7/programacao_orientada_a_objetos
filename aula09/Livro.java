package aula09;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    /*Construtor */
    public Livro(String tituloLivro, String autorLivro, int anoPublicacaoLivro){
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.anoPublicacao = anoPublicacaoLivro;
        this.disponivel = true;
    } 
    /*Metódos */
    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
    public boolean emprestrar(){
        if(disponivel){
            disponivel = false;
            return true;
        }
        return false;
    }
    public void devolver(){
        disponivel = true;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public String getTitulo() {
        return titulo;
    }
}
