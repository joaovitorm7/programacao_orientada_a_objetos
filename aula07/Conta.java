package aula07;

import java.util.Date;

public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;
    Date dataCriacao;
    
    public void imprimirBanco(){
        System.out.println("Banco Digital SI");
    }
    public void sacar(double valor){
        double saque = this.saldo-valor;
    }
}
