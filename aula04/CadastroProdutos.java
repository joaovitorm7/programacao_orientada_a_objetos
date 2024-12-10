import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("===== Menu de Produtos =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Exibir Produtos");
            System.out.println("3. Buscar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do produto para adicionar: ");
                String nomeProduto = scanner.nextLine();
                produtos.add(nomeProduto);
                System.out.println("Produto adicionado com sucesso!");
            } else if (opcao == 2) {
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    System.out.println("Produtos cadastrados:");
                    for (String produto : produtos) {
                        System.out.println("- " + produto);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Digite o nome do produto para buscar: ");
                String nomeProduto = scanner.nextLine();
                if (produtos.contains(nomeProduto)) {
                    System.out.println("Produto encontrado: " + nomeProduto);
                } else {
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 4) {
                System.out.print("Digite o nome do produto para excluir: ");
                String nomeProduto = scanner.nextLine();
                if (produtos.remove(nomeProduto)) {
                    System.out.println("Produto removido com sucesso!");
                } else {
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
