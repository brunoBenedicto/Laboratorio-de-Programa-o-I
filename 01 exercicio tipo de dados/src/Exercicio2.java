import java.util.Scanner;

public class Exercicio2 {
	/*
	 * Crie um programa Java no Eclipse que obtenha dois n�meros. 
	 * O primeiro n�mero representa o sal�rio de um empregado e o
	 * segundo n�mero representa as d�vidas que o empregado possui. 
	 * O programa deve subtrair o sal�rio do empregado pelas suas 
	 * d�vidas e exibir o saldo dispon�vel (o que sobrar� ap�s
     * pagar as contas!)
	 */

	public static void main(String[] args) {
		double salario, debitos, saldo;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do seu salario");
		salario = entrada.nextDouble();
		System.out.println("Agora digite o seu total de dividas");
		debitos = entrada.nextDouble();
		saldo = salario - debitos;
		entrada.close();
		
		if(saldo > 0)

			System.out.println("�Voc� ainda possui um saldo de R$  " +saldo+  "!");
		else
			if (saldo < 0 )
				System.out.println("voce esta devendo R$" +saldo);
			else
				System.out.println("saldo zerado");
		
	}

}
