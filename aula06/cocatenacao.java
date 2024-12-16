import java.util.Scanner;

public class cocatenacao {
    public static void main(String[] args) {
        String nome = "João";
        double valor = 25.8;
        int nota = 9;
        System.out.println("Aluno: "+nome+" Nota: "+nota);
        System.out.printf("Aluno: %s Nota: %d Valor: %.2f",nome, nota, valor);
        String name;
        Scanner ent = new Scanner(System.in);
        System.out.println("\nDigite a idade do aluno: ");
        int idade = ent.nextInt();
        System.out.println("Digite o nome do aluno: ");
        name = ent.nextLine();
        ent.nextLine();
        System.out.println("Digite seu sálario: ");
        double salario = ent.nextDouble();
        System.out.println("Sua Idade é: "+idade+ " seu nome é: "+name+"seu salario é: "+salario);
    }
}
