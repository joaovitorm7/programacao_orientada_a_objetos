public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("Gol", 2018);
        car.acelerar();
        car.acelerar(100, 5);

        Veiculo meuVeiculo = new Veiculo(); // Certifique-se de que Veiculo tem um construtor
        meuVeiculo.mover(); // Chama o método da superclasse

        Carro meuCarro = new Carro("Fusca", 1970);
        meuCarro.mover();
    }
}
