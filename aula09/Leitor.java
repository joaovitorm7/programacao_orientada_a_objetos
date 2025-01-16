package aula09;

public class Leitor {
    private String nome;
    private int idade;
    private Livro livroEmprestado;

    /*Construtor */
    public Leitor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.livroEmprestado = null;
    }

    /*Metódos */
    public void pegarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro fornecido é inválido.");
            return;
        }
    
        if (livroEmprestado != null) {
            System.out.println(nome + " já possui um livro emprestado: " + livroEmprestado.getTitulo());
            return;
        }
    
        if (livro.emprestrar()) {
            livroEmprestado = livro;
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
        }
    }
    public void devolverLivro() {
        if (livroEmprestado != null) {
            livroEmprestado.devolver();
            System.out.println(nome + " devolveu o livro: " + livroEmprestado.getTitulo());
            livroEmprestado = null;
        } else {
            System.out.println(nome + " não possui nenhum livro para devolver.");
        }
    }
}
