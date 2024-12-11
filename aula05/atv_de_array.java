import java.util.Scanner;

public class atv_de_array {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int maior;
        int menor;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor para a posição " + i +": ");
            numeros[i] = entrada.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("A soma de todos os números do Array é: " +soma);

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
        System.out.println("O maior número do array é: "+maior);
        System.out.println("O menor número do array é: "+menor);
    }
}
