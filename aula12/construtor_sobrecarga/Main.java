public class Main {
    public static void main(String[] args) {
        Assalariado as = new Assalariado("João", 6500);
        Comissionado co = new Comissionado("Vitor", 25000, 10);
        Horista hr = new Horista("Maia", 50, 52);

        Empresa emp = new Empresa();

        emp.adicionarFuncnario(as);
        emp.adicionarFuncnario(co);
        emp.adicionarFuncnario(hr);

        emp.ListarFuncionarios();

    }
}
