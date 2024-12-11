import java.util.Scanner;
import java.util.ArrayList;

public class atv_de_arraylist {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 5){
            System.out.println("-----MENU-----");
            System.out.println("1. Adicionar cidade");
            System.out.println("2. Remover cidade");
            System.out.println("3. Exibir cidades");
            System.out.println("4. Buscar cidade");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                System.out.println("Informe o nome da cidade que você quer adicionar: ");
                String nomeCidade = entrada.nextLine();
                cidades.add(nomeCidade);
                System.out.println("Cidade adicionada com sucesso!");
            } else if(opcao == 2){
                System.out.println("Informe nome da cidade que você quer remover: ");
                String removeCidade = entrada.nextLine();
                if (cidades.remove(removeCidade)) {
                    System.out.println("Cidade removida com sucesso!");
                } else {
                    System.out.println("Cidade não encontrada.");
                }
            } else if(opcao == 3){
                System.out.println("Cidades Cadastradas: ");
                if (cidades.isEmpty()) {
                    System.out.println("Nenhuma cidade cadastrada.");
                } else {
                    System.out.println("Cidades cadastradas:");
                    for (String cidade : cidades) {
                        System.out.println("- " + cidade);
                    }
                }
            } else if(opcao == 4){
                System.out.println("Digite o nome da cidade que você quer buscar: ");
                String buscaCidade = entrada.nextLine();
                if (cidades.contains(buscaCidade)) {
                    System.out.println("Cidade Encontrada: " + buscaCidade);
                } else {
                    System.out.println("Cidade não encontrada.");
                } 
            } else if(opcao == 5){
                System.out.println("Encerrando o programa...");
            } else{
                System.out.println("Oopção inválida.");
            }
        }
    }
}