public class Carro {
    // Atributos
    String modelo;
    int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metódos
    public void acelerar(){
        System.out.println("Meu carro "+ modelo +" está acelerando");
    }

    public void acelerar(double velocidade, int marchas){
        System.out.println("Meu carro " + modelo + "está andando a " + velocidade + "km/h e está na marcha " + marchas);
    }
    
}
