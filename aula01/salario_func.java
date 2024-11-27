public class salario_func {
    public static void main(String[] args) {
        double salario = 3450;
        double desempenhoA = (20*salario)/100;
        double desempenhoB = (10 * salario)/100;
        double novoSalario = salario + desempenhoB;
        if(novoSalario > 5000){
            double desconto = (15 * salario)/100;
            novoSalario = novoSalario - desconto;
            System.out.println("Seu Salário com desconto é: "+ novoSalario);
        } else if(novoSalario >= 3000 && novoSalario <= 5000){
            double desconto = (10 * novoSalario)/100;
            novoSalario = novoSalario - desconto;
            System.out.println("Seu Salário com desconto é: "+ novoSalario);
        } else if(novoSalario < 3000){
            double desconto = (5 * novoSalario)/100;
            novoSalario = novoSalario - desconto;
            System.out.println("Seu Salário com desconto é: "+novoSalario);
        }
    }
} 
