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

    
    public boolean compararPorId(Produto outroProduto) {
        return this.id.equals(outroProduto.id);
    }

    public int compararPorPreco(Produto outroProduto) {
        if(preco < outroProduto.preco) {
            return -1;
        } else if(preco == outroProduto.preco) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean compararPorCategoria(Produto outroProduto) {
        return this.categoria.equals(outroProduto.categoria);
    }

    public String exibirDetalhes(){
        return "ID: " + id + "\nNome: " + nome + "\nCategoria: " + categoria + "\nPreço: " + preco;
    }


}
