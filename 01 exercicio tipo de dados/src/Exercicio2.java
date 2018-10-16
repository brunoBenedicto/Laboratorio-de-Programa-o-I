import java.util.Scanner;

public class Exercicio2 {
	/*
	 * Crie um programa Java no Eclipse que obtenha dois números. 
	 * O primeiro número representa o salário de um empregado e o
	 * segundo número representa as dívidas que o empregado possui. 
	 * O programa deve subtrair o salário do empregado pelas suas 
	 * dívidas e exibir o saldo disponível (o que sobrará após
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

			System.out.println("“Você ainda possui um saldo de R$  " +saldo+  "!");
		else
			if (saldo < 0 )
				System.out.println("voce esta devendo R$" +saldo);
			else
				System.out.println("saldo zerado");
		
	}

}
