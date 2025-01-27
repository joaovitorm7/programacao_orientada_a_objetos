package aula11.Construtor_sobrecarga.src;

public class Funcionario {
    String nome;
    int matricula;
    String dataNascimento;
    String telefone;
    String endereco;

    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Funcionario(String nome, int matricula, String dataNas){
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNas;
    }

    public Funcionario(String nome, int matricula, String dataNas, String tel){
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNas;
        this.telefone = tel;
    }
}
