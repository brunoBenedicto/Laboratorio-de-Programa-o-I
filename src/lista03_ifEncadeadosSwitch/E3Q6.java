package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q6 {

	public static void main(String[] args) {
		/*
		 * Ler três valores e colocá-los em ordem crescente.
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
				if (num2 > num3)
					System.out.printf("%d %d %d", num1, num2, num3);
				else
					System.out.printf("%d %d %d", num1, num3, num2);
		if (num2 > num1)
			if (num2 > num3)
				if (num1 > num3)
					System.out.printf("%d %d %d", num2, num1, num3);
				else
					System.out.printf("%d %d %d", num2, num3, num1);
		if (num3 > num1)
			if (num3 > num2)
				if (num1 > num2)
					System.out.printf("%d %d %d", num3, num1, num2);
				else
					System.out.printf("%d %d %d", num3, num2, num1);
		

	}

}
