package aula09;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    /*Construtor */
    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivrosDisponiveis(){
        System.out.println("Livros Disponíveis: ");
        for (Livro livro : livros) {
            if(livro.isDisponivel()){
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
    public void listarLivrosEmprestados(){
        System.out.println("Livros Emprestados: ");
        for (Livro livro : livros) {
            if(!livro.isDisponivel()){
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}
