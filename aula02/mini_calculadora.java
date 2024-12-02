import java.util.Scanner;

public class mini_calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, res;
        String operador;
        int cont = 0;
        while(cont == 0){
            System.out.println("***Nova Operação***");
            System.out.println("Informe o primeiro Valor: ");
            n1 = entrada.nextInt();
            System.out.println("Informe o segundo valor: ");
            n2 = entrada.nextInt();
            System.out.println("Informe a operação: soma(+) -- subtração(-) -- multiplicação(*) -- divisão(/)");
            operador=entrada.next();
            if(operador.equals("+")){
                res = n1 + n2;
                System.out.println("O resultado é igual: "+res);
            } else if(operador.equals("-")){
                res = n1 - n2;
                System.out.println("O resultado é igual: "+res);
            } else if(operador.equals("*")){
                res = n1 * n2;
                System.out.println("O resultado é igual: "+res);
            } else if(operador.equals("/")){
                if(n2 > 0){
                    res = n1/n2;
                    System.out.println("O resultado é igual: "+res);
                } else{
                    System.out.println("Operação inválida. Divisor menor ou igual a 0");
                }
            } else{
                System.out.println("Escolha uma operação .");
            }
            System.out.println("Deseja fazer outra operação: 0 = SIM, 1 = NÃO");
            cont=entrada.nextInt();
        }
    }
    
}
