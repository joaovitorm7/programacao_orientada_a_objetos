import java.util.ArrayList;
import java.util.Scanner;

public class cadastro_de_produtos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<String>();
        int opcao;
        String teste;

        while (opcao != 5) {
            System.out.println("======MENU=====");
            System.out.println(" 1 - Adicionar Produtos");
            System.out.println(" 2 - Exibir Produtos");
            System.out.println(" 3 - Buscar Produto");
            System.out.println(" 4 - Excluir Produto");
            System.out.println(" 5 - Sair");
            System.out.println("Escolha uma opção");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                System.out.println("Informe o nome do produto: ");
                produtos.add(entrada.nextLine());
            } if(opcao == 2){
                System.out.println("Informe o nome do produto que quer que exiba: ");

            } if(opcao == 3){
                System.out.println("Qual produto quer buscar? ");
                produtos.get(entrada.nextInt());
            } if(opcao == 4){
                System.out.println("Qual produto quer excluir? ");
                teste = entrada.nextLine();
                System.out.println(produtos.contains(teste));
                produtos.remove(entrada.nextLine());
            }

        }

        entrada.close();
    }
    
}
