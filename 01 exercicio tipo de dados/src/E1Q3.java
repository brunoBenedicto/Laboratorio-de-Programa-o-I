import java.util.Scanner;

public class E1Q3 {
/*
 * Crie um programa Java no Eclipse que obtenha dois n�meros. 
 * O primeiro n�mero representa a nota do aluno na primeira 
 * unidade e o segundo representa a nota do aluno na segunda 
 * unidade. O programa deve exibir a m�dia aritm�tica final, 
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
		
		System.out.println("A media final �: " +(nota1+nota2)/2);

	}

}
