package src;

import java.util.Random;

public class Main {
	
	private static Random r = new Random();
	
	//Exercicio 5
	
	public static void imprimeTabuada(int numero) {
		for(int i = 0; i < 10; i++) {
			int index = i + 1;
			int result = numero * (i+1);
			System.out.println(numero + " x " + index + " = " + result);
		}
	}
	//Exercicio 6
	public static void ex6() {
		int maior = 0;
		int menor = 100;
		String s = "";
		for(int i = 0; i < 10; i++) {
			int numero = r.nextInt(101);
			s += numero + " ";
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
			
		}
		System.out.println(s);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
	
	//Exercicio 7
	
	public static void fibbonacci(int numero) {
		if(numero >= 0) {
			System.out.println(0);
		}if(numero >= 1) {
			System.out.println(1);
		}
		int n0 = 0;
		int n1 = 1;
		int acumulador = 0;
		for(int i = 2; i <= numero; i++) {
			acumulador = n0 + n1;
			n0 = n1;
			n1 = acumulador;
			System.out.println(acumulador);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.print("\f");
		//Exercicio 5
		System.out.println("Exercício 5");
		for(int i = 0; i < 3; i++) {
			imprimeTabuada(i + 1);
		}
		
		//Exercicio 6
		System.out.println("Exercício 6");
		ex6();
		
		//Exercicio 7
		System.out.println("Exercício 7");
		fibbonacci(9);
		
	}
	
}
