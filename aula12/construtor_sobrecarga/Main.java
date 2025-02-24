public class Main {
    public static void main(String[] args) {
        Assalariado as = new Assalariado("João Vitor", 6500);
        Comissionado co = new Comissionado("Maria", 25000, 10);
        Horista hr = new Horista("Marcos", 50, 52);
        Contratado ct = new Contratado("Ana", 500);

        Empresa emp = new Empresa();

        emp.adicionarFuncnario(as);
        emp.adicionarFuncnario(co);
        emp.adicionarFuncnario(hr);
        emp.adicionarFuncnario(ct);

        emp.ListarFuncionarios();

    }
}
