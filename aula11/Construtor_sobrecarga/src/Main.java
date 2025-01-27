package aula11.Construtor_sobrecarga.src;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Paula", 1254);
        Funcionario f2 = new Funcionario("Luiz", 1234, "12/12/1990");
        Funcionario f3 = new Funcionario("Maria", 1122, "12/12/1990", "1234-5678");
    }
}
