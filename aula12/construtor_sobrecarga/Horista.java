public class Horista extends Empregado{
    double precoHora;
    double horasTrabalhadas;

    public Horista(String nome, double preco, double horas) {
        super(nome);
        this.precoHora = preco;
        this.horasTrabalhadas = horas;
    }

    @Override
    public double vencimento(){
        double horas = this.precoHora * this.horasTrabalhadas;
        return horas;
    }
}
