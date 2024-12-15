import java.util.ArrayList;
import java.util.Scanner;

public class gerenciamento_de_alunos_com_arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Listar alunos");
            System.out.println("4. Pesquisar aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    alunos.add(nome); // Adiciona aluno ao ArrayList
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (alunos.remove(nomeRemover)) { // Remove aluno se existir
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Lista de alunos:");
                    for (String aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do aluno a ser pesquisado: ");
                    String nomePesquisar = scanner.nextLine();
                    if (alunos.contains(nomePesquisar)) { // Verifica se o aluno está na lista
                        System.out.println("Aluno encontrado!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
