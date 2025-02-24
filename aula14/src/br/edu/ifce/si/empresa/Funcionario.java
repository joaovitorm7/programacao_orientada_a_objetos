package aula14.src.br.edu.ifce.si.empresa;

import java.util.ArrayList;

import aula14.src.br.edu.ifce.si.beneficios.Beneficiosfunc;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private ArrayList<Beneficiosfunc> beneficios;

    /* CONSTRUTOR */
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.beneficios = new ArrayList<>();
    }

    /*SOBRECARGA DE CONSTRUTOR*/
    public Funcionario(String nome){
        this.nome = nome;
        this.salarioBase = 2000;
        this.beneficios = new ArrayList<>(); 
    }

    /* GETTERS E SETTERS */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Salário base não pode ser negativo.");
        }
    }

    /* METODOS */
    public double calcularSalario(){
        return this.salarioBase;
    }

    public void exibirDados(String nome, double salario){
        System.err.println("***** DADOS *****");
        System.out.println("Nome: " + this.nome +" - Salário: "+ this.salarioBase);
    }

    public void adicionarBeneficio(Beneficiosfunc beneficio){
        this.beneficios.add(beneficio);
    }

    public ArrayList<Beneficiosfunc> getBeneficiosfuncs(){
        return this.beneficios;
    }

    public void listarBeneficios(){
        System.out.println("Benefícios do Funcionário "+ this.nome +":");
        for (Beneficiosfunc beneficio : beneficios) {
            System.out.println(beneficio.getNome() + " - " + beneficio.getValor());
        }
    }
}
