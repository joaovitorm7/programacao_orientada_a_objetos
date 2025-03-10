package aula16;

public class Equipamento {
    String nome;
    String marca;
    double preco;

    public Equipamento(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public boolean ligarEquipamentos(){
        return true;
    }

    public boolean desligarEquipamentos(){
        return false;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }
}
