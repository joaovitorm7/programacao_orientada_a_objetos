public class Comissionado extends Empregado{
    double totalVenda;
    double taxaComissao;

    public Comissionado(String nome, double vendas, double comissao){
        super(nome);
        this.totalVenda = vendas;
        this.taxaComissao = comissao;
    }

    @Override
    public double vencimento(){
        double taxa = this.taxaComissao/100;
        double valorReceber = this.totalVenda * taxa;
        return valorReceber; 
    }
}
