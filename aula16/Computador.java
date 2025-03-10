package aula16;

public class Computador extends Equipamento implements Conectividade{

    public Computador(String nome, String marca, double preco) {
        super(nome, marca, preco);
    }

    @Override
    public boolean conectar() {
        System.out.println("O "+nome+" está conectado.");
        return true;
    }

    public boolean desconectar() {
        System.out.println("O "+nome+" Desconectou.");
        return false;
    }

    public void instalarSoftware() {
        System.out.println("Instalando software...");
    }
}
