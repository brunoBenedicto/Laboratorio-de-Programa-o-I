package lista04_estruturasDeRepeticao;

import java.util.Scanner;

public class E4Q4 {
	public static void main(String[] args) {
		/*
		 * Leia dois valores e realize uma das opera��es abaixo descritas abaixo. O
		 * programa s� deve ser encerrado se o usu�rio escolher a op��o 6! � 1 � soma �
		 * 2 � subtra��o � 3 � multiplica��o � 4 � divis�o � 5 � compara��o entre os
		 * n�meros (informando se eles s�o iguais ou, no caso de diferentes, o maior
		 * entre eles) � 6 � encerrar o programa
		 * 
		 */
		int num1, num2, operacao;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("escolha a opera��o");
			System.out.println("1 - soma");
			System.out.println("2 - subtra��o");
			System.out.println("3 - multipica��o");
			System.out.println("4 - divis�o");
			System.out.println("5 - compara��o");
			System.out.println("6 - sair");
			operacao = entrada.nextInt();
			if (operacao == 6)
				continue;
			System.out.println("digite o primeiro numero");
			num1 = entrada.nextInt();
			System.out.println("digite o segundo numero");
			num2 = entrada.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("soma � igual a: " + (num1 + num2));
				break;
			case 2:
				System.out.println("a subitra��o � igual a: " + (num1 - num2));
				break;
			case 3:
				System.out.println("a mutiplica��o � igual a " + (num1 * num2));
				break;
			case 4:
				System.out.println("a divisao � " + (num1 / num2));
				break;
			case 5:
				System.out.println("o maior � " + (Math.max(num1, num2)));
			}
		} while (operacao != 6);
		entrada.close();
		System.out.println("saiu");
	}

}
