import java.util.Scanner;

public class E2Q2 {

	/*
	 * Fa�a um programa Java que determina se a soma de dois n�meros � um n�mero par
	 * ou �mpar. Os n�meros ser�o lidos do console do Eclipse. � Exemplos: � Se o
	 * usu�rio informou os n�meros 6 e 7, o programa exibir� �A soma � 13 e o n�mero
	 * � �mpar!�
	 */
	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro numero:");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero:");
		num2 = entrada.nextInt();
		entrada.close();
		soma = num1 + num2;
		if(soma%2 == 0)
			System.out.println("a soma � "+soma+" e o numero � par");
		else
			System.out.println("a soma � "+soma+" e o numero � impar");
	}

}
