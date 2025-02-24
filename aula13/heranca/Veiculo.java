public class Veiculo{
    String marca;
    String modelo;
    int ano;
    double preco;

    /* CONSTRUTOR PAI */
    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano; 
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("*****Detalhes dos Veículos*****");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
}