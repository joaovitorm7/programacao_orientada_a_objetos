package aula14.src;
import java.util.ArrayList;
import java.util.Scanner;

import aula14.src.br.edu.ifce.si.beneficios.Beneficiosfunc;
import aula14.src.br.edu.ifce.si.empresa.Funcionario;

public class Main {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Benefício");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                cadastrarFuncionario();
            } else if(opcao == 2){
                cadastrarBeneficio();
            }
        } while (opcao != 4);
    }

    private static void cadastrarFuncionario(){
        System.out.println("Nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("Salário Base do funcionário: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salarioBase);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void cadastrarBeneficio(){
        System.out.println("Nome do Funcionário que receberá o benefício: ");
        String nomeFuncionario = scanner.nextLine();
        Funcionario funcionario = encontrarFuncionario(nomeFuncionario);

        if (funcionario != null) {
            System.out.print("Descrição do benefício: ");
            String descricao = scanner.nextLine();
            System.out.print("Valor do benefício: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Beneficiosfunc beneficio = new Beneficiosfunc(descricao, valor);
            funcionario.adicionarBeneficio(beneficio);
            System.out.println("Benefício cadastrado com sucesso!");
        } else {
            System.out.println("Funcionário não Encontrado!");
        }
    }
}
