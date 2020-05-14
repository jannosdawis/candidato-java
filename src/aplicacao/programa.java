package aplicacao;

import java.util.Scanner;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, experiencia;
		char disponibilidade, habilitacao;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		opcao = sc.nextInt();
		System.out.println("");
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		disponibilidade = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		sc.close();
	}
}
