public class Caminhao extends Veiculo {
    String modelo;
    int ano;

    public Caminhao(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está acelerando na estrada!");
    }

}