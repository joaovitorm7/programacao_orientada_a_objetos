import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Informe sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("****DADOS CADASTRADOS****");
        System.out.println("O nome informado foi: "+nome);
        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua altura é: "+altura);
    }
}
