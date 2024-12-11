import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class notas_alunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a nota do aluno (ou -1 para sair)");
            double nota = entrada.nextDouble();

            if(nota == -1){
                continuar = false;
            } else if(nota >= 0 && nota <= 10){
                notas.add(nota);
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota cadastrada.");
        } else {
            double maiorNota = Collections.max(notas);
            double menorNota = Collections.min(notas);

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.size();

            Collections.sort(notas);

            System.out.println("\nResultados:");
            System.out.println("Notas cadastradas (em ordem crescente): " + notas);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média das notas: " + media);
        }

        entrada.close();
    }
}
