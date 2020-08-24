package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// variáveis
		String nome;
		double peso, altura, imc;
		// objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso / (altura * altura);
		// saida
		System.out.println("=================");
		System.out.println("Nome: " + nome);
		System.out.println("Seu imc é de: " + formatador.format(imc));

		if (imc < 17) {
			System.out.println("Resultado: Muito abaixo do peso");
		} else if (imc >= 17 && imc < 18.5) {
			System.out.println("Resultado: Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Resultado: Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Resultado: Acima do peso");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Resultado: Obesidade I");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Resultado: Obesidade II (Severa)");
		} else {
			System.out.println("Resultado: Obesidade III (Mórbida)");
		}
		teclado.close();

	}

}
