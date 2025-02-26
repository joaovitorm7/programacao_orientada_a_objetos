public class Main {
    public static void main(String[] args) {

        Carro car = new Carro("Corolla", 2020);
        car.acelerar();

        car.setModelo("Honda Civic");
        car.setAno(2020);

        System.out.println("Novo Modelo: " + car.getModelo() + " Ano: " + car.getAno());
        
        //Veiculo[] veiculos = { new  Carro("Gol", 2018), new Caminhao("Volvo", 2019), new Veiculo() };
    
        //for (Veiculo veiculo : veiculos) {
        //veiculo.mover();
        //}
    }
}
