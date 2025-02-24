package aula14.src.br.edu.ifce.si.empresa;

public class Desenvolvedor extends Funcionario{
    
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() * 1.0;
    }
}
