package lista02_operadoresLogicos;
import java.util.Scanner;

public class E2Q5 {
	/*
	 * Fa�a um programa que leia o primeiro nome de uma pessoa. O programa deve
	 * verificar se o nome possui mais de 8 letras: � Se tiver mais de 8 letras deve
	 * mostrar a mensagem �Muito grande!� � Se tiver menos de 8 letras deve
	 * verificar se h� a alguma letra �L� em qualquer posi��o do nome informado: �
	 * Se houver letra �L� exibir a mensagem �Voc� tem L!� � Sen�o houver letra �L�
	 * exibir a mensagem �Voc� n�o tem L!�
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
				System.out.println("n�o contem L");
			
	}

}
