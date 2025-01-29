public class Contratado extends Comissionado{
    double portaria;

    public Contratado(String nome, double portaria){
        super(nome, portaria, portaria);
        this.portaria = portaria;
    }

    public double vencimento(){
       double taxa = this.taxaComissao / 100;
       double valorReceber = this.totalVenda * taxa;
       return portaria + valorReceber;
    }
}
