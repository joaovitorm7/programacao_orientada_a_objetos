public class Carro extends Veiculo{
    // Atributos
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Get para obter o modelo do carro
    public String getModelo(){
        return modelo;
    }

    // Setters para definir o modelo do carro
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    // Get para obter o ano do carro
    public int getAno(){
        return ano;
    }

    // Setters para definir o ano do carro
    public void  setAno(int ano){
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
