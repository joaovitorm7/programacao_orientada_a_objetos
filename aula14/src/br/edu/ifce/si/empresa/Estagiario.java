package aula14.src.br.edu.ifce.si.empresa;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        int auxilioFixo = 500;
        return getSalarioBase() + auxilioFixo;
    }
    
}
