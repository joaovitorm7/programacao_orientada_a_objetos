package aula08;

public class Conta {
    int numero;
    String titular;
    double saldo=0;
    double limite=0;
    double saldoDevedor=0;

    public void cadastrarConta(int num, String nome){
        this.numero = num;
        this.titular = nome;
    }
    public void visualizarConta(){
        System.out.println("Numero:"+this.numero+" - Titular: "+this.titular);
    }
    public void transferirValor(double valor, Conta c1){
        if(valor<=this.saldo){
            c1.depositar(valor);
            this.saldo=this.saldo-valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valorDep){
        if(this.saldoDevedor>0){
            if(valorDep>=saldoDevedor){
                double v2= valorDep-this.saldoDevedor;
                double v3=valorDep-v2;
                this.saldoDevedor=this.saldoDevedor-v3;
                this.saldo=this.saldo+v2;
                this.limite=this.limite+v3;
            }else{
                this.saldoDevedor=this.saldoDevedor-valorDep;
                this.limite=this.limite+valorDep;
            }
        }else{
            this.saldo=this.saldo+valorDep;
        }
        System.out.println("Depósito Efetuado com Sucesso.");
    }
    public void visualizarSaldo(){
        System.out.println("***** Dados da Conta****");
        System.out.println("Numero: "+this.numero+" - Titular: "+this.titular);
        System.out.println("Seu saldo é: "+this.saldo);
        System.out.println("Seu limite é: "+this.limite);
        System.out.println("Seu Saldo devedor é: "+this.saldoDevedor);
    }
    public void definirLimite(double valor){
        this.limite=valor;
        System.out.println("Limite Atualizado");
    }
    public void sacar(double valor){
        if(valor>this.saldo){
            double acm = this.saldo+this.limite;
            if(valor<=acm){
                double valor2 = valor-this.saldo;
                this.saldo = 0;
                this.limite=this.limite-valor2;
                this.saldoDevedor=this.saldoDevedor+valor2;
                System.out.println("Saque realizado com sucesso (uso do limite)");

            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            this.saldo=saldo-valor;
            System.out.println("Saque realizado com sucesso");
        }

    }
}