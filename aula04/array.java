import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior;
        int menor;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Informe um valor: ");
            numeros[i] = entrada.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println(entrada);
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
    }
}
