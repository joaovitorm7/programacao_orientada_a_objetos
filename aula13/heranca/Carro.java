public class Carro extends Veiculo {
    int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double preco, int quantidadePortas){
        super(marca, modelo, ano, preco);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();;
        System.out.println("Quantidade de Portas: "+quantidadePortas);
    }

}
