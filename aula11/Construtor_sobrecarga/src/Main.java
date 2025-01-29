package aula11.Construtor_sobrecarga.src;

public class Main {
    public static void main(String[] args) {
       Veiculo v1 = new Veiculo("Chevrolet", "Onix");
       Veiculo v2 = new Veiculo("Toyota", "Corolla", 2024, 180.000);
       v1.exibirInfo();
       v2.exibirInfo("BRL");
       v1.confVeiculo(2015, 90.000);
       double pag1 = v1.calcularDesconto(10);
       System.out.println("Valor com desconto (Percentual) = "+pag1);
       double pag2 = v2.calcularDesconto(1250);
       System.out.println("Valor com desconto (fixo) = "+pag2);
    }
}
