package Programa;

import java.util.Scanner;

public class ProgramaTeste {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("CALCULADORA IMC!!\n");
		System.out.println("Digite seu peso (em kg):");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura(em metros): ");
		double altura = entrada.nextDouble();

		double imc = Programa.calcularIMC(peso, altura);

		System.out.printf("Seu IMC é %.2f\n", imc);
		Programa.verificarIMC(imc);
		
		entrada.close();
	}
}