public class Assalariado extends Empregado {
    double salario;

    /* CONSTRUTOR */
    public Assalariado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    @Override
    public double vencimento(){
        return this.salario;
    }
}
