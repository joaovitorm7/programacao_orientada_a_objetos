import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();
        alunos.add("João"); /*Metodo ADD, sempre adiciona no final */
        alunos.add("Maria");
        alunos.add("Vitor");
        alunos.add("Clara");

        System.out.println("Aluno: "+alunos.get(2)); /* Metodo GET, printa de acordo com o indice ou nome */
        alunos.remove("Vitor"); /* Metodo REMOVE, remove pelo nome ou indice */
        System.out.println("Aluno: "+alunos.get(2));
        alunos.set(1, "Luiz"); /* Metodo SET, adiciona no indice desejado */
        System.out.println("Aluno: "+alunos.get(1));
        System.out.println(alunos.contains("Clara")); /* Metdo CONTAINS, verifica se existe no array */
        System.out.println(alunos.contains("Bianca")); 
    }
}
