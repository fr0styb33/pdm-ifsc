package exercicio3;

public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    
    
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    
   
    @Override
    public double area() {
        return altura * largura;
    }

    @Override
    public double perimetro() {
        return 2*(altura+largura);
    }
}