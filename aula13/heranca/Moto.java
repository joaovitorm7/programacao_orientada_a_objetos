public class Moto extends Veiculo{
    int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano, cilindradas);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
