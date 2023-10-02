package exercicio3;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    @Override
    public double area() {
    	
        return Math.PI*raio*raio;
    }

    @Override
    public double perimetro() {
    	
        return 2*Math.PI*raio;
    }
}
