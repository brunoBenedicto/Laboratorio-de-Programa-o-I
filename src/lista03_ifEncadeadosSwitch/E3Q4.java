package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q4 {

	public static void main(String[] args) {
		/*
		 * Leia tr�s n�meros do teclado e informe qual � o maior. Use o comando if
		 * encadeado!
		 */

		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o numero 1");
		num1 = entrada.nextInt();
		System.out.println("digite o numero 2");
		num2 = entrada.nextInt();
		System.out.println("digite o numero 3");
		num3 = entrada.nextInt();
		entrada.close();

		if (num1 > num2)
			if (num1 > num3)
				System.out.println(num1);
			else
				System.out.println(num3);
		else if (num2 > num3)
			System.out.println(num2);
		else
			System.out.println(num3);

	}
}