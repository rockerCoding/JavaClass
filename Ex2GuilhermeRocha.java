/*
 * Guilherme Rocha
 * 0050015970 

 No segundo arquivo, crie um programa para ler um 
 * n�mero inteiro e dizer se o n�mero � par ou �mpar*/
import java.util.Scanner;

public class Ex2GuilhermeRocha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o n�mero: ");
		Long num = input.nextLong();
		input.close();
		if(num % 2 == 0) System.out.println(num + " � par");
		else System.out.println(num + " � impar");
	}
}
