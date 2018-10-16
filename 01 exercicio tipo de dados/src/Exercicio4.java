import java.util.Scanner;

public class Exercicio4 {
	/*
	 *  A nota de um aluno é calculada usando uma média
		ponderada, pois a segunda nota vale mais do que a
		primeira. Faça um programa Java que lê 2 números e
		calcula a média ponderada, usando o peso 2 para a
		primeira nota e o peso 3 para a segunda nota.
	 */

	public static void main(String[] args) {
		double nota1, nota2, mediaP;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("'digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("digitte a segunda nota");
		nota2 = entrada.nextDouble();
		entrada.close();
		
		mediaP = ((nota1*2)+(nota2*3))/5;
		System.out.println("A media final é: " + mediaP);


	}

}
