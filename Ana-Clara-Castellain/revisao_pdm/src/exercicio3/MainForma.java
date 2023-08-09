package exercicio3;

public class MainForma {
    public static void main(String[] args) {
        
        double aRetangulo = 5.0;
        double lRetangulo = 8.0;
        Retangulo retangulo = new Retangulo(aRetangulo, lRetangulo);

        
        double ladoQuadrado = 4.0;
        Quadrado quadrado = new Quadrado(ladoQuadrado);

        
        double rCirculo = 3.0;
        Circulo circulo = new Circulo(rCirculo);

        
        double arRetangulo = retangulo.area();
        double pRetangulo = retangulo.perimetro();

        double arQuadrado = quadrado.area();
        double pQuadrado = quadrado.perimetro();

        double arCirculo = circulo.area();
        double pCirculo = circulo.perimetro();

       
        System.out.println("Retângulo:");
        System.out.println("Área: " + arRetangulo);
        System.out.println("Perímetro: " + pRetangulo);

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + arQuadrado);
        System.out.println("Perímetro: " + pQuadrado);

        System.out.println("\nCírculo:");
        System.out.println("Área: " + arCirculo);
        System.out.println("Perímetro: " + pCirculo);
    }
}