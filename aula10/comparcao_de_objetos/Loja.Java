package aula10.comparcao_de_objetos;
import java.util.ArrayList;


public class Loja {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String compararProduto(Produto p1, Produto p2, String criterio) {
        if (criterio.equalsIgnoreCase("categoria")) { 
            if (p1.categoria.equalsIgnoreCase(p2.categoria)) {
                return "Os produtos são da mesma categoria.";
            } else {
                return "Os produtos pertencem a categorias diferentes.";
            }
        } else if (criterio.equalsIgnoreCase("preco")) {
            int resultado = p1.compararPorPreco(p2);
            if (resultado < 0) return "O produto " + p1.nome + " é mais barato.";
            if (resultado > 0) return "O produto " + p2.nome + " é mais barato.";
            return "Os produtos têm o mesmo preço.";
        }
        return "Critério inválido.";
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Não há produtos cadastrados.");
            return;
        } else{
            for(Produto produto : produtos){
                System.out.println(produto.exibirDetalhes());
            }
        }
        
    }
}
