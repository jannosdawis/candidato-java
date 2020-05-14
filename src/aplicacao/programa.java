package aplicacao;  // PROJETO CRIADO

import java.util.Scanner;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolaridade, experiencia, escpts, exppts;
		char disponibilidade, habilitacao;
		
	// LEITURA DA ESCOLARIDADE
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
	// LEITURA DOS OUTROS DADOS
		System.out.println("");
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		disponibilidade = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
	// ESCOLARIDADE E EXPERIENCIA
		if (escolaridade == 1){
			escpts = 10;
		}else if(escolaridade == 2){
			escpts = 20;
		}else if(escolaridade == 3){
			escpts = 30;
		}else{
			escpts = 40;
		}
		if ((experiencia > 0)&&(experiencia <= 2)){
			exppts = 10;
		}else if ((experiencia > 2 )&&(experiencia <= 5)){
			exppts = 20;
		}else if(experiencia > 5){
			exppts = 40;
		}else{
			exppts = 0;
		}
		System.out.println("");
		System.out.println("Pontos por escolaridade: " + escpts);
		System.out.println("Pontos por experiência: " + exppts);
		sc.close();
	}
}
