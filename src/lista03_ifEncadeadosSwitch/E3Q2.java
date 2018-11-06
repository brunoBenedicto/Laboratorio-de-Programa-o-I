package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q2 {
	/*
	 * Leia 2 números inteiros do teclado. Se o segundo número for igual a zero,
	 * exibir a mensagem: “Divisão por zero não é permitida!”. Se for diferente de
	 * zero e a divisão for exata, exibir a mensagem: “A divisão é exata e vale
	 * XXX”. . Se for diferente de zero e a divisão não for exata, exibir a
	 * mensagem: “A divisão não é exata e o resto é XXX
	 */

	public static void main(String Args[]) {
		int dividendo, divisor, quociente;
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o dividendo");
		dividendo = entrada.nextInt();
		System.out.println("digite o divisor");
		divisor = entrada.nextInt();
		entrada.close();
		

		if (divisor != 0) {
			quociente = dividendo / divisor;
			if (dividendo % divisor == 0)
				System.out.println("a conta é exata, o resultado é " + quociente);
			else
				System.out.println("a conta não é exata, o resultado é " + quociente + "e o resto é " + dividendo % divisor);
		} else
			System.out.println("não se pode dividir por zero ");

	}
}
