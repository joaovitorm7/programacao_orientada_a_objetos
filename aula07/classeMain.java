package aula07;

public class classeMain {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.cadastrarAluno("João Vitor", 123, "88999272125", "19/05/2005");
        a1.visualizarAluno();

        int matricula1 = a1.retornarMatricula();
        System.out.println("Matricula retornada foi: " + matricula1);
        String n = "Maria";
        int m = 123;
        String t = "88999272125";
        String d = "19/05/2005";
        Aluno a2 = new Aluno();
        a2.cadastrarAluno(n, m, t, d);
        a2.visualizarAluno();

    }
}
