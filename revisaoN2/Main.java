public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = { new  Carro("Gol", 2018), new Caminhao("Volvo", 2019), new Veiculo() };
    
        for (Veiculo veiculo : veiculos) {
        veiculo.mover();
        }
    }
}
