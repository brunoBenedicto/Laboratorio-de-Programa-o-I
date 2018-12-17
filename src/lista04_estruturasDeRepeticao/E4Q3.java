package lista04_estruturasDeRepeticao;

import java.util.Scanner;

public class E4Q3 {

	public static void main(String[] args) {
		/*
		 * Leia um número inteiro e exiba todos os divisores deste número. • Exemplo, se
		 * o usuário informar o número inteiro 20, o programa deverá exibir a mensagem:
		 * “Os divisores de 20 são: 20, 10, 5, 4, 2, 1”
		 * 
		 */

		int numero;
		int divisor;
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero");
		numero = entrada.nextInt();
		divisor = numero;
		entrada.close();
		System.out.println("os divisores de "+numero+" são:");
		while (divisor > 1) {
			if (numero % divisor == 0)
				System.out.print(divisor + ", ");
			divisor--;
		}
		System.out.println(divisor);

	}

}
