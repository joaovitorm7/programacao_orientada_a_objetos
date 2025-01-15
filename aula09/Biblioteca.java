package aula09;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<String> livros = new ArrayList<String>();
    }

    public void adicionarLivro(String livro){
        ArrayList<String> livros = new ArrayList<String>();
        livros.add(livro);
    }
    public void listarLivrosDisponiveis(){
        ArrayList<String> livros = new ArrayList<String>();
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    }
    public void listarLivrosEmprestados(){
        ArrayList<String> livros = new ArrayList<String>();
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    }
}
