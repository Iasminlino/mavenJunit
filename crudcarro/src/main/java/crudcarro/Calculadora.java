package crudcarro;

public class Calculadora {
	public int SomaInteiros(int a, int b) {
		return a + b;
	}
	
	public int subtraInteiros(int a, int b) {
        return a - b;
    }
	
	public int multiplicaInteiros(int a, int b) {
        return a * b;
    }
	
	public double dividNumer(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("N�o h� divis�o por zero");
        }
        return a / b;
    }

}
