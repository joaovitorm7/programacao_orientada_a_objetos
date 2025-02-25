public class Carro extends Veiculo{
    // Atributos
    String modelo;
    int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    //Sobrescrevendo o método mover
    @Override
    public void mover(){
        System.out.println("O carro está acelerando na estrada!");
    }

    // Metódos
    public void acelerar(){
        System.out.println("Meu carro "+ modelo +" está acelerando");
    }

    public void acelerar(double velocidade, int marchas){
        System.out.println("Meu carro " + modelo + "está andando a " + velocidade + "km/h e está na marcha " + marchas);
    }
    
}
