package aula09;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro l3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        Leitor leitor1 = new Leitor("João", 25);
        Leitor leitor2 = new Leitor("Maria", 30);

        System.out.println("\n--- Livros disponíveis inicialmente ---");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n--- João pega um livro ---");
        leitor1.pegarLivro(l1);

        System.out.println("Maria pega um livro ---");
        leitor2.pegarLivro(l2);

        System.out.println("\n--- Status dos livros após o empréstimo ---");
        biblioteca.listarLivrosDisponiveis();
        biblioteca.listarLivrosEmprestados();

        System.out.println("\n--- João devolve o livro ---");
        leitor1.devolverLivro();
        System.out.println("Maria devolve o livro ---");
        leitor2.devolverLivro();

        System.out.println("\n--- Status dos livros após a devolução ---");
        biblioteca.listarLivrosDisponiveis();
        biblioteca.listarLivrosEmprestados();
    }  
}
