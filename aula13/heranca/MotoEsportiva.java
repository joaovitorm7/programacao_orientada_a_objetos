public class MotoEsportiva extends Moto{
    int velocidadeMaxima;

    public MotoEsportiva(String marca, String modelo, int ano, int cilindradas, int velocidadeMaxima){
        super(marca, modelo, ano, cilindradas);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
    }
}
