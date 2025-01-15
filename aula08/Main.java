package aula08;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c2.cadastrarConta(456, "Maria");
        c2.visualizarSaldo();
        System.out.println("***********************");
        c1.cadastrarConta(123, "Aldo");
        c1.visualizarConta();
        c1.depositar(700);
        c1.definirLimite(200);
        c1.visualizarSaldo();
        c1.sacar(600);
        c1.visualizarSaldo();
        c1.sacar(200);
        c1.visualizarSaldo();
        c1.depositar(350);
        c1.visualizarSaldo();
        c1.transferirValor(100, c2);
        c1.visualizarSaldo();
        System.out.println("***********************");
        c2.visualizarSaldo();
    }
}
