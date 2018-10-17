import java.util.Scanner;

public class E1Q3 {
/*
 * Crie um programa Java no Eclipse que obtenha dois números. 
 * O primeiro número representa a nota do aluno na primeira 
 * unidade e o segundo representa a nota do aluno na segunda 
 * unidade. O programa deve exibir a média aritmética final, 
 * a partir das duas notas informadas. 
 */
	public static void main(String[] args) {
		double nota1, nota2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("'digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("digitte a segunda nota");
		nota2 = entrada.nextDouble();
		entrada.close();
		
		System.out.println("A media final é: " +(nota1+nota2)/2);

	}

}
