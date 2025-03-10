package aula16;

public class Main {
    public static void main(String[] args) {
        Equipamento e = new Equipamento("Notebook", "Dell", 3000.0);
        e.exibirInformacoes();
        RedeDeEquipamentos r = new RedeDeEquipamentos();
        r.ConectarEquipamento(new Computador("Notebook", "Dell", 3000.0));
        r.GerarImpressao(new Impressora("HP", "Laser", 500.0));
        
    }
}
