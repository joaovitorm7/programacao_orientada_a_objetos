import java.util.Scanner;

public class while_and_doWhile {
    public static void main(String[] args) {
        int n = 1;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Informe o valor para N: "); 
            n = entrada.nextInt();
            if(n%2 == 0){
                System.out.println("O valor de N é: "+n+" e é par");
            }
            System.out.println("O valor de N é: "+n);
        }while(n!=0);
    }
}
