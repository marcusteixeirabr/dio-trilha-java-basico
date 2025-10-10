package br.com.dio.trilha_java_basico;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int secondNumber = scanner.nextInt();
		
		try {
			
			count(firstNumber, secondNumber);
			
		} catch (Exception error) {
			System.out.println("O segundo parâmetro deve ser menor que o primeiro!");
			error.printStackTrace();
		}
		
		scanner.close();
	}

	static void count(int n1, int n2) throws ParametrosInvalidosException {
		if (n2 > n1) {
			for (int i = 1; i <= n2 - n1; i++) {
				System.out.println("imprimindo o número " + i);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}
