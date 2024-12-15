import java.util.Scanner;

public class gerenciamento_de_alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[100];
        int cont = 0;
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
                    if (cont < alunos.length) {
                        System.out.print("Digite o nome do aluno: ");
                        String nome = scanner.nextLine();
                        alunos[cont] = nome;
                        cont++;
                    } else {
                        System.out.println("Lista de alunos cheia!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cont; i++) {
                        if (alunos[i].equalsIgnoreCase(nomeRemover)) {
                            alunos[i] = alunos[cont - 1]; // Substitui pelo último aluno
                            alunos[cont - 1] = null; // Remove o último aluno
                            cont--;
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Lista de alunos:");
                    for (int i = 0; i < cont; i++) {
                        System.out.println(alunos[i]);
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do aluno a ser pesquisado: ");
                    String nomePesquisar = scanner.nextLine();
                    boolean existe = false;
                    for (int i = 0; i < cont; i++) {
                        if (alunos[i].equalsIgnoreCase(nomePesquisar)) {
                            existe = true;
                            break;
                        }
                    }
                    if (existe) {
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
