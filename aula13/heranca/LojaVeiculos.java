import java.util.Date;
import java.util.ArrayList;


public class LojaVeiculos {
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    ArrayList<RegistroVenda> vendas = new ArrayList<RegistroVenda>();

    public void cadastrarVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado: " + veiculo);
    }

    public void exibirEstoque() {
        if (veiculos.isEmpty()) {
            System.out.println("veiculos vazio.");
        } else {
            System.out.println("Estoque de veículos:");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
    }

    public int calcularValorTotalEstoque() {
        return veiculos.size();
    }

    public int calcularEstoqueMoto() {
        int quantidade = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int calcularEstoqueCarro() {
        int quantidade = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                quantidade++;
            }
        }
        return quantidade;
    }

     public void realizarVenda(Date data, Veiculo veiculo) {
        if (veiculos.contains(veiculo)) {
            veiculos.remove(veiculo);
            RegistroVenda venda = new RegistroVenda(data, veiculo);
            vendas.add(venda);
            System.out.println("Venda realizada: " + venda);
        } else {
            System.out.println("Veículo não encontrado no estoque.");
        }
    }

    public void exibirVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            System.out.println("Registros de vendas:");
            for (RegistroVenda venda : vendas) {
                System.out.println(venda);
            }
        }
    }

}
