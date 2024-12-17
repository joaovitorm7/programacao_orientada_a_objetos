import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        double [][] notas = new double[3][2];
        Scanner ent = new Scanner(System.in);

        for(int l = 0; l < notas.length; l++){
            for(int c = 0; c < notas[l].length; c++){
                System.out.println("Aluno: " + (l+1)+ " Nota: "+ (c+1));
                notas[l][c]=ent.nextDouble();
            }
        }
        for(int l = 0; l < notas.length; l++){
            for(int c = 0; c < notas[l].length; c++){
                System.out.println("Aluno: "+ (l+1)+ " nota "+ (c+1));
            }
        }
        for(int i = 0; i < notas.length; i++){
            double soma = 0;
            for(int j = 0 ; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            System.out.println("Média do aluno " + (i+1) + " é: " + (soma/notas[i].length));
        }
    }
}
