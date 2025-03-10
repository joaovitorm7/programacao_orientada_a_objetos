package aula16;

public class Impressora extends Equipamento implements Conectividade, Impressao{

    public Impressora(String nome, String marca, double preco) {
        super(nome, marca, preco);
    }

    @Override
    public boolean imprimir() {
        System.out.println("A "+nome+" está imprimindo.");
        return true;
    }

    public boolean cancelarImpressao() {
        return false;
    }

    public void impressao() {
        System.out.println("Imprimindo...");
    }

    @Override
    public boolean conectar() {
        System.out.println("O "+nome+" está conectado.");
        return true;
    }

    public boolean desconectar() {
        return false;
    }

    public void configurarImpressora() {
        System.out.println("Configurando impressora...");
    }
}
