public class main {
    public static void main(String[] args) {
        double [] notas = new double[10];
        for(int i = 0; i < notas.length; i++) {
            notas[i] = i * 3 + 1;
        }
        for(double n:notas){ // percorre do primeiro ao último elemento
            System.out.println("Nota: " +n);
        }
    }
}
