package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q2 {
	/*
	 * Leia 2 n�meros inteiros do teclado. Se o segundo n�mero for igual a zero,
	 * exibir a mensagem: �Divis�o por zero n�o � permitida!�. Se for diferente de
	 * zero e a divis�o for exata, exibir a mensagem: �A divis�o � exata e vale
	 * XXX�. . Se for diferente de zero e a divis�o n�o for exata, exibir a
	 * mensagem: �A divis�o n�o � exata e o resto � XXX
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
				System.out.println("a conta � exata, o resultado � " + quociente);
			else
				System.out.println("a conta n�o � exata, o resultado � " + quociente + "e o resto � " + dividendo % divisor);
		} else
			System.out.println("n�o se pode dividir por zero ");

	}
}
