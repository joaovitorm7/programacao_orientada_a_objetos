package aula10.comparcao_de_objetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um produto");
            System.out.println("2. Comparar dois produtos pelo ID");
            System.out.println("3. Comparar dois produtos pelo preço");
            System.out.println("4. Comparar dois produtos pela categoria");
            System.out.println("5. Listar todos os produtos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto: ");
                    String id = scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a categoria do produto: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(id, nome, categoria, preco);
                    loja.adicionarProduto(produto);
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o ID do primeiro produto: ");
                    String id1 = scanner.nextLine();
                    System.out.print("Digite o ID do segundo produto: ");
                    String id2 = scanner.nextLine();
                    Produto p1 = null;
                    Produto p2 = null;
                    for (Produto p : loja.produtos) { 
                        if (p.id.equals(id1)) p1 = p;
                        if (p.id.equals(id2)) p2 = p;
                    }
                    if (p1 != null && p2 != null) {
                        System.out.println(p1.compararPorId(p2) ? "Os produtos têm o mesmo ID." : "Os produtos têm IDs diferentes.");
                    } else {
                        System.out.println("Produto(s) não encontrado(s).");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do primeiro produto: ");
                    id1 = scanner.nextLine();
                    System.out.print("Digite o ID do segundo produto: ");
                    id2 = scanner.nextLine();
                    p1 = null;
                    p2 = null;
                    for (Produto p : loja.produtos) {
                        if (p.id.equals(id1)) p1 = p;
                        if (p.id.equals(id2)) p2 = p;
                    }
                    if (p1 != null && p2 != null) {
                        System.out.println(loja.compararProduto(p1, p2, "preco"));
                    } else {
                        System.out.println("Produto(s) não encontrado(s).");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do produto: ");
                    id = scanner.nextLine();
                    System.out.print("Digite a categoria do produto: ");
                    categoria = scanner.nextLine();
                    p1 = null;
                    for (Produto p : loja.produtos) {
                        if (p.id.equals(id)) p1 = p;
                    }
                    if (p1 != null) {
                        if (p1.categoria.equals(categoria)) {
                            System.out.println("O produto pertence à categoria informada.");
                        } else {
                            System.out.println("O produto não pertence à categoria informada.");
                        }
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    break;

                case 5:
                    loja.listarProdutos();
                    break;

                case 6:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Opção inválida.");
            }
        }  
    }
}

