package br.com.generation.condicionais;

import java.util.Scanner;

public class ExercicioLista2 {

	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite um numero:");
		n1 = leia.nextInt();
		
		System.out.println("Digite um numero:");
		n2 = leia.nextInt();
		
		System.out.println("Digite um numero:");
		n3 = leia.nextInt();
		
		if ( n1>n2 && n1>n3) {
		
		System.out.println("O maior numero �: " + n1);
		
		}
		else if ( n2>n3 && n2>n1 ){
			System.out.println("O maior numero �: " + n2);
			
		}
		
		else if ( n3>n2 && n3>n1 ) {
			System.out.println("O maior numero �: " + n3);
		}
		
		
		
		leia.close();
	}

}
