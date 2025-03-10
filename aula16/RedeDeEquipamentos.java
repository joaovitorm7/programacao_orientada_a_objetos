package aula16;

public class RedeDeEquipamentos {

    public RedeDeEquipamentos(){};

    public void ConectarEquipamento(Conectividade c){
        c.conectar();
    }

    public void GerarImpressao(Impressora i){
        if(i.conectar() == true){
            i.imprimir();
        }
    }
}
