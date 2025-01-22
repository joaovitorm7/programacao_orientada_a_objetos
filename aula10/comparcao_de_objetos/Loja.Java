package aula10.comparcao_de_objetos;
import java.util.ArrayList;


public class Loja {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void compararProduto(Produto p1, Produto p2) {
        if (p1.id.equals(p2.id)) {
            System.out.println("Produto encontrado");
        } else {
            System.out.println("Produto não encontrado");
        }
    }
}
