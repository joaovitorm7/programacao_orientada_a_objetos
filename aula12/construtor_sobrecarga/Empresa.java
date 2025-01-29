import java.util.ArrayList;

public class Empresa {
    ArrayList<Empregado> funcionarios = new ArrayList<Empregado>();

    public void adicionarFuncnario(Empregado e){
        this.funcionarios.add(e);
    }

    public void ListarFuncionarios(){
        System.out.println("***** Lista de Funcionários e Pagamentos *****");
        for(Empregado e: this.funcionarios){
            System.out.println("Nome: "+e.nome);
            System.out.println("Valor a receber: "+e.vencimento());
        }
    }

    
}
