package aplicacao;

import java.util.Scanner;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		opcao = sc.nextInt();
		
		sc.close();
	}
}
