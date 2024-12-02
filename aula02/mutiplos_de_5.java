public class mutiplos_de_5 {
    public static void main(String[] args) {
        int cont = 1;
        int quantidade = 0;
        int soma = 0;
        while(cont <= 100){
            if(cont % 5 == 0){
                soma += cont;
                quantidade++;
            }
            cont++;
        }
        System.out.println("A soma dos números multiplos de 5 entre 1 a 100 são: "+soma);
        System.out.println("A quantidade de multiplos de 5 são: "+quantidade);
    }
}
