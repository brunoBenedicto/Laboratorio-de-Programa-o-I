package lista04_estruturasDeRepeticao;

import java.util.Scanner;

public class E4Q4 {
	public static void main(String[] args) {
		/*
		 * Leia dois valores e realize uma das operações abaixo descritas abaixo. O
		 * programa só deve ser encerrado se o usuário escolher a opção 6! – 1 – soma –
		 * 2 – subtração – 3 – multiplicação – 4 – divisão – 5 – comparação entre os
		 * números (informando se eles são iguais ou, no caso de diferentes, o maior
		 * entre eles) – 6 – encerrar o programa
		 * 
		 */
		int num1, num2, operacao;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("escolha a operação");
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multipicação");
			System.out.println("4 - divisão");
			System.out.println("5 - comparação");
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
				System.out.println("soma é igual a: " + (num1 + num2));
				break;
			case 2:
				System.out.println("a subitração é igual a: " + (num1 - num2));
				break;
			case 3:
				System.out.println("a mutiplicação é igual a " + (num1 * num2));
				break;
			case 4:
				System.out.println("a divisao é " + (num1 / num2));
				break;
			case 5:
				System.out.println("o maior é " + (Math.max(num1, num2)));
			}
		} while (operacao != 6);
		entrada.close();
		System.out.println("saiu");
	}

}
