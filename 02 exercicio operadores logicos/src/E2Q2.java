import java.util.Scanner;

public class E2Q2 {

	/*
	 * Faça um programa Java que determina se a soma de dois números é um número par
	 * ou ímpar. Os números serão lidos do console do Eclipse. • Exemplos: – Se o
	 * usuário informou os números 6 e 7, o programa exibirá “A soma é 13 e o número
	 * é ímpar!”
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
			System.out.println("a soma é "+soma+" e o numero é par");
		else
			System.out.println("a soma é "+soma+" e o numero é impar");
	}

}
