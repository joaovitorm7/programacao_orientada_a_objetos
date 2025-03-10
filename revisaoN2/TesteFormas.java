public class TesteFormas {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(5, 10);

        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
    }
    
}
