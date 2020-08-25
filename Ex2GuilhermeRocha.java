/*
 * Guilherme Rocha
 * 0050015970 

 No segundo arquivo, crie um programa para ler um 
 * número inteiro e dizer se o número é par ou ímpar*/
import java.util.Scanner;

public class Ex2GuilhermeRocha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número: ");
		Long num = input.nextLong();
		input.close();
		if(num % 2 == 0) System.out.println(num + " é par");
		else System.out.println(num + " é impar");
	}
}
