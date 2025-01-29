public class Comissionado extends Empregado{
    double totalVenda;
    int taxaComissao;

    public double vencimento(){
        double taxa = this.taxaComissao/100;
        double valorReceber = this.totalVenda * taxa;
        return valorReceber; 
    }
}
