package aula14.src.br.edu.ifce.si.beneficios;

public class Beneficiosfunc {
    private String nome;
    private double valor;

    /* CONSTRUTOR */
    public Beneficiosfunc(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        if(valor >= 0){
            this.valor = valor;
        } else {
            System.out.println("Valor não pode ser negativo");
        }
    }

    
}
