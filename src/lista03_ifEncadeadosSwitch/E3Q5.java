package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q5 {
	/*
	 * Calcular a m�dia final dadas as notas das 2 provas e produzir uma sa�da com a
	 * m�dia e a situa��o do aluno de acordo com o seguinte crit�rio: � m�dia >= 7,
	 * aprovado; � 3 <= m�dia < 7, recupera��o; � m�dia < 3, reprovado. � Considerar
	 * tamb�m o n�mero de faltas do aluno: se forem mais que 4 faltas, o aluno
	 * estar� automaticamente reprovado (o usu�rio deve fornecer o numero de
	 * faltas). � Se o aluno se encontrar em recupera��o, solicitar a nota da quarta
	 * prova e, ap�s calcular a media final (usando a m�dia da FBV) , informar se o
	 * aluno passou (media final >=5) ou n�o.
	 */
	public static void main(String[] Args) {
		double nota1, nota2, nota3, notaFinal;
		double media, mediaFinal;
		int faltas;
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = entrada.nextDouble();
		System.out.println("digite o numero de faltas");
		faltas = entrada.nextInt();

		media = (nota1 + nota2) / 2;

		if (faltas < 4) {
			if (media >= 7)
				System.out.println("Aprovado por media");
			else {
				System.out.println("digite a terceira nota");
				nota3 = entrada.nextDouble();
				if (nota3 > nota1 || nota3 > 2) {
					if (nota1 > nota2) {
						media = (nota3 + nota1) / 2;
						if (media >= 7) {
							System.out.println("Aprovado");
							return;
						}
					} else {
						media = (nota3 + nota2) / 2;
						if (media >= 7) {
							System.out.println("Aprovado");
							return;
						}
					}
				}
				if (media >= 3) {
					System.out.println("digite a nota final");
					notaFinal = entrada.nextDouble();
					mediaFinal = (media + notaFinal) / 2;
					if (mediaFinal >= 5)
						System.out.println("Aprovado");
					else
						System.out.println("Reporvado");
				}

			}
		} else
			System.out.println("Reprovado por falta");
		entrada.close();
	}
}
