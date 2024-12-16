import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        int n = 0;
        Scanner ent = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();
        alunos.add("João");
        alunos.add("Vitor");
        alunos.set(0, "Maia");
        alunos.remove("João");

        for(String a:alunos){
            System.out.println("Alunos "+a);
        }

        boolean temAluno = alunos.contains("Maia");
        System.out.println("Maia é aluno? "+temAluno);
        temAluno = alunos.contains("Vitor");
        System.out.println("Vitor é aluno? "+temAluno);
    }
}
