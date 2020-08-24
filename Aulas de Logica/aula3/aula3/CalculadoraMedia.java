package Exercicios;

import java.util.Scanner;

public class CalculadoraMedia {
/**
 * 
 * @autor Tarcisio
 * Cálculo da media
 */

	public static void main(String[] args) {
		//variaveis
		String nome;
		double nota1,nota2,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a nota1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextDouble();
		//processamento
		media = (nota1 + nota2) / 2;
		//saida
		System.out.println("======================");
		System.out.println("== Cauculo da media ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		teclado.close();
	}

}
