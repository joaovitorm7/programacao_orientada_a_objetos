package aula10.comparcao_de_objetos;


public class Produto {
    String id;
    String nome;
    String categoria;
    double preco;

    public Produto(String id, String nome, String categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public void CompararProdutoId(String id) {
        if (this.id.equals(id)) {
            System.out.println("Produto encontrado");
        } else {
            System.out.println("Produto não encontrado");
        }
    }


}
