/* 
 * Guilherme Rocha
 * 0050015970
 * 
 * No primeiro arquivo, crie um programa em Java que 
imprima a tabuada de multiplicação de um número de 0-9 
lido do teclado. */

import java.util.Scanner;

public class Ex1GuilhermeRocha {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Short num; 
		do {
			System.out.printf("Digite um número de 0 a 9: ");
			num = input.nextShort();
			if(num < 0 || num > 10) {
				System.out.println("Número inválido, tente novamente.");
			} else input.close();
		} while (num < 0 || num > 10);
		Integer i;
		for(i = 0; i < 10; i++) {
			System.out.printf(num + " x " + i + " = " + (num * i) + "\n");
		}
	}

}
