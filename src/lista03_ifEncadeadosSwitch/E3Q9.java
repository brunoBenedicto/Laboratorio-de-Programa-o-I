package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q9 {

	public static void main(String[] args) {
		/*
		 * Leia dois valores e realize uma das operações abaixo descritas abaixo. O
		 * programa deve ser feito usando a estrutura de controle “switch...case”,
		 * possibilitando a escolha do usuário por uma das opções. – 1 : soma – 2 :
		 * subtração – 3 : multiplicação – 4 : divisão – 5 : comparação entre os números
		 * (informando se eles são iguais ou, no caso de diferentes, o maior entre eles)
		 */

		int num1, num2, operacao;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("digite o primeiro numero");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero");
		num2 = entrada.nextInt();
		
		System.out.println("escolha a operação");
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multipicação");
		System.out.println("4 - divisão");
		System.out.println("5 - comparação");
		operacao = entrada.nextInt();
		entrada.close();
		
		switch(operacao) {
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
		case 4:
			System.out.println(num1/num2);
			break;
		case 5:
			System.out.println(Math.max(num1, num2));
		}
		
		
	}

}
