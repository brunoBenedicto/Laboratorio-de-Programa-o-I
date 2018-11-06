package lista02_operadoresLogicos;
import java.util.Scanner;

public class E2Q5 {
	/*
	 * Faça um programa que leia o primeiro nome de uma pessoa. O programa deve
	 * verificar se o nome possui mais de 8 letras: – Se tiver mais de 8 letras deve
	 * mostrar a mensagem “Muito grande!” – Se tiver menos de 8 letras deve
	 * verificar se há a alguma letra ‘L’ em qualquer posição do nome informado: •
	 * Se houver letra ‘L’ exibir a mensagem “Você tem L!” • Senão houver letra ‘L’
	 * exibir a mensagem “Você não tem L!”
	 * 
	 */

	public static void main(String[] args) {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o nome");
		nome = entrada.next();
		entrada.close();
		if(nome.length()>8)
			System.out.println("muito grande");
		else 
			if(nome.contains("l")||nome.contains("L"))
				System.out.println("contem L");
			else
				System.out.println("não contem L");
			
	}

}
