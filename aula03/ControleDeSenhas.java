import java.util.Scanner;

public class ControleDeSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaAtual = 0;
        int senhaDeAtendimento = 1;
        int opcao;
        
        System.out.println("Bem-vindo ao Sistema de Controle de Senhas!");
        System.out.println("Digite 1 para gerar uma nova senha, 2 para atender, ou 0 para encerrar.");
        
        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                senhaAtual++;
                System.out.println("Sua senha é: " + senhaAtual);
            } else if (opcao == 2) {
                if (senhaDeAtendimento > senhaAtual) {
                    System.out.println("Nenhuma senha para atender no momento.");
                } else {
                    System.out.print("Atendendo senha " + senhaDeAtendimento);
                    if (senhaDeAtendimento % 5 == 0) {
                        System.out.println(" - Senha premiada: você ganhou um brinde!");
                    } else {
                        System.out.println(".");
                    }
                    senhaDeAtendimento++;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
