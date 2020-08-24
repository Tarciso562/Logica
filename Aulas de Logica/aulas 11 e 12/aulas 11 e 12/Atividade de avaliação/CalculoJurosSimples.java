package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoJurosSimples {

	public static void main(String[] args) {

		int opcao;
		
		String nome;
		
		double capital,taxa,prazo,montante,juros;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		System.out.println("Calculo de juros simples");
		System.out.println("");
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("");
		System.out.println("Olá " + nome + ", este aplicativo calcula prazos e taxas mensais ou anuais;");
		System.out.println("");
		System.out.println(nome + " lembrando que se for calcular a taxa mensal, o prazo tem que ser mensal.");
		System.out.println("Se for calcular a taxa anual, o prazo tem que ser anual.");
		System.out.println("");	
		System.out.println("Escolha uma das opções que deseja calcular:");	
		System.out.println("1. Montante;");
		System.out.println("2. Capital;");
		System.out.println("3. Juros;");
		System.out.println("4. Taxa;");
		System.out.println("5. Prazo;");
		System.out.println("");
		System.out.print("Digite a opção do calculo: ");
		opcao = teclado.nextInt ();
		
		switch (opcao) {
		
		case 1:
		System.out.print("Digite o valor do Capital: R$ ");
		capital = teclado.nextDouble();
		System.out.print("Digite o valor da Taxa: " + " % ");
		taxa = teclado.nextDouble();
		System.out.print("Digite o valor do Prazo: ");
		prazo = teclado.nextDouble();
		montante = capital * (1 + taxa / 100 * prazo );
		System.out.println("Montante: R$ " + formatador.format(montante));
		break;
		
		case 2:
			System.out.print("Digite o valor do Montante: R$ ");
			montante = teclado.nextDouble();
			System.out.print("Digite o valor da Taxa: " + " % ");
			taxa = teclado.nextDouble();
			System.out.print("Digite o valor do Prazo: ");
			prazo = teclado.nextDouble();
			capital = montante / (1 + taxa / 100 * prazo );			
			System.out.println("Capital: R$ " + formatador.format(capital));
			break;
		
		case 3:
			System.out.print("Digite o valor do Capital: R$ ");
			capital = teclado.nextDouble();
			System.out.print("Digite o valor da Taxa: " + " % ");
			taxa = teclado.nextDouble();
			System.out.print("Digite o valor do Prazo: ");
			prazo = teclado.nextDouble();
			juros = capital * taxa / 100 * prazo;
			System.out.println("Juros: R$ " + formatador.format(juros));
			break;
			
		case 4:
			System.out.print("Digite o valor do Montante: R$ ");
			montante = teclado.nextDouble();
			System.out.print("Digite o valor do Capital: R$ ");
			capital = teclado.nextDouble();
			System.out.print("Digite o valor do Prazo: ");
			prazo = teclado.nextDouble();
			taxa = (montante / capital - 1) / prazo * 100;
			System.out.println("Taxa: " + formatador.format(taxa) + "  % ");
			break;
			
		case 5:
			System.out.print("Digite o valor do Montante: R$ ");
			montante = teclado.nextDouble();
			System.out.print("Digite o valor do Capital: R$ ");
			capital = teclado.nextDouble();
			System.out.print("Digite o valor do Taxa: " + " % ");
			taxa = teclado.nextDouble();
			prazo = (montante / capital - 1) / taxa * 100;
			System.out.println("Prazo: " + formatador.format(prazo) + " ano(s)/mes(es)");
			break;
		} 
			
		teclado.close();

	}

}
