package aula11.Construtor_sobrecarga.src;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    double preco;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void confVeiculo(int ano, double preco){
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Informações do veículo:");
        System.out.println("Marca: " + this.marca+"\nModelo: "+this.modelo+"\nAno: "+this.ano);
     
    }

    public void exibirInfo(String moeda){
        System.out.println("Informações do veículo:");
        System.out.println("Marca: " + this.marca+"\nModelo: "+this.modelo+"\nAno: "+this.ano);
        if(moeda=="USD" || moeda=="usd"){
            System.out.println("Preço (USD): "+this.preco);
        }else if(moeda=="BRL" || moeda=="brl"){
            System.out.println("Preço (R$): "+this.preco);
        }else{
            System.out.println("Moeda Inválida");
        }
    }

    public double calcularDesconto(double percentual){
        double desconto = (percentual/100)*this.preco;
        
        return (this.preco - desconto);
    }

    public double calcularDesconto(int valorFixo){
        return (this.preco - valorFixo);
    }
}
