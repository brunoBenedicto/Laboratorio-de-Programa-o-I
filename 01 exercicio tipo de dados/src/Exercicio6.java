import java.util.Scanner;

public class Exercicio6 {
	

	/*
	 * 	Fa�a um programa em Java que calcule a �rea de um
		c�rculo, usando fun��es e constantes da API. O valor
		do raio deve ser lido a partir do console do Eclipse. O
		valor da �rea deve ser mostrado com 2 casas
		decimais.
	 */

	public static void main(String[] args) {
		double area, raio;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o valor do raio");
		raio = entrada.nextDouble();
		entrada.close();
		area=Math.PI*Math.exp(raio);
		
		System.out.println("a area do circulo � "+area);
	}

}
