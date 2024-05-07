package Programa;

public class Programa {

	public static double calcularIMC(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	 public static void verificarIMC(double imc) {
	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (imc >= 18.5 && imc <= 24.9) {
	            System.out.println("Peso ideal (parabéns)");
	        } else if (imc >= 25.0 && imc <= 29.9) {
	            System.out.println("Levemente acima do peso"); 
	        } else if (imc >= 30.0 && imc <= 34.9) {
	            System.out.println("Obesidade grau 1");
	        } else if (imc >= 35.0 && imc <= 39.9) {
	            System.out.println("Obesidade grau 2 (severa)");
	        } else {
	            System.out.println("Obesidade grau 3 (mórbida)");
	        }
	    }
}
