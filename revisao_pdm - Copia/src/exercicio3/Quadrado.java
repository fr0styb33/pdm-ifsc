package exercicio3;

public class Quadrado extends Retangulo {
	
    public Quadrado(double lado) {
    	
        super(lado, lado); 
    }

    public double getLado() {
    	
        return getAltura(); 
    }
    public void setLado(double lado) {
       
    	setAltura(lado); 
        setLargura(lado);
    }
}

