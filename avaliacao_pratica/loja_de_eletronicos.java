import java.util.Scanner;
import java.util.ArrayList;

public class loja_de_eletronicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        int numeroProdutos;
        int opcao = 0;

        do {
            System.out.println("***** MENU ***** ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto pelo nome.");
            System.out.println("4 - Filtrar produtos por faixa de preço.");
            System.out.println("5 - Exibir o produto mais caro e o mais barato.");
            System.out.println("6 - Exibir o valor total e a média de preços.");
            System.out.println("7 - Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                System.out.print("Digite quantos produtos quer cadastrar? ");
                numeroProdutos = entrada.nextInt();
                entrada.nextLine();
                for(int i = 0; i < numeroProdutos; i++){
                    System.out.print("Digite o nome do produto: ");
                    String produto = entrada.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    Double preco = entrada.nextDouble();
                    entrada.nextLine();
                    produtos.add(produto);
                    precos.add(preco);
                }
            } else if(opcao == 2){
                System.out.println("Produtos: ");
                for(String produto : produtos){
                    System.out.println(produto);
                }
            } else if(opcao == 3){
                System.out.print("Digite o nome do produto que deseja procurar: ");
                String nome_produto = entrada.nextLine();
                int indice = produtos.indexOf(nome_produto);
                if(indice != -1){
                    System.out.println("O produto "+nome_produto+" foi encontrado!");
                } else{
                    System.out.println("O produto "+nome_produto+" não foi encontrado!");
                }
            } else if(opcao == 4) {
                System.out.print("Digite o valor mínimo: R$");
                float minimo = entrada.nextFloat();
                System.out.print("Digite o valor máximo: R$");
                float maximo = entrada.nextFloat();
                entrada.nextLine();
                for(int i = 0; i < produtos.size(); i++){
                    if(minimo <= precos.get(i) && precos.get(i) <= maximo){
                        System.out.println("O produto que está nessa faixa de preço é: "+produtos.get(i)+" e o preço é: R$"+precos.get(i));
                    }
                }
            } else if(opcao == 5) {
                if (produtos.size() == 0) {
                    System.out.println("Não há produtos cadastrados.");
                    return;
                }
                double maisCaro = precos.get(0);
                double maisBarato = precos.get(0);
                String produtoMaisCaro = produtos.get(0);
                String produtoMaisBarato = produtos.get(0);

                for(int i = 1; i < produtos.size(); i++){
                    if(precos.get(i) > maisCaro){
                        maisCaro = precos.get(i);
                        produtoMaisCaro = produtos.get(i);
                    }
                    if(precos.get(i) < maisBarato){
                        maisBarato = precos.get(i);
                        produtoMaisBarato = produtos.get(i);
                    }
                }
                System.out.println("Produto mais caro: " + produtoMaisCaro + " Preço: R$" + maisCaro);
                System.out.println("Produto mais barato: " + produtoMaisBarato + " Preço: R$" + maisBarato);
            } else if(opcao == 6) {
                float total = 0;
                float media = 0;
                for(int i = 0; i < precos.size(); i++){
                    total += precos.get(i);
                }
                media = total / precos.size();
                System.out.println("O valor total dos produtos: R$"+total);
                System.out.println("A média dos preços: R$"+media);
               
            } else if(opcao == 7){
                System.out.println("Encerrando o programa...");
            }

        } while(opcao != 7); 
 
    }
}
