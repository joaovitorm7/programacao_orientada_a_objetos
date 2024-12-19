package aula07;

public class Aluno {
    String nome;
    int matricula;
    String telefone;
    String data_nascimento;

    public void visualizarAluno(){
        System.out.println("*****Dados dos alunos*****");
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Data de nascimento: "+this.data_nascimento);
    }

    public void cadastrarAluno(String nome, int mat, String tel, String data_nas){
        this.nome = nome;
        this.matricula = mat;
        this.telefone = tel;
        this.data_nascimento = data_nas;
    }

    public int retornarMatricula(){
        return this.matricula;
    }
}
