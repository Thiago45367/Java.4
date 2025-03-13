public class FormaApp {
    public static void main(String[] args) {
        
        Forma circle = new Circulo(5);
        double formaCirculo = circle.calcularArea();
        System.out.println("Forma do círculo: " + formaCirculo);

        Forma rectangle = new Retangulo(4, 6);
        double formaRetangulo = rectangle.calcularArea();
        System.out.println("Forma do retângulo: " + formaRetangulo);
    }

}

