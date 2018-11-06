package lista01_tiposDeDados;
import java.util.Scanner;

public class E1Q7 {
	/*
	 *	Faça um programa em Java que leia um texto
		qualquer e substitua qualquer ocorrência da letra ‘a’
		pelo símbolo ‘@’
	 */

	public static void main(String[] args) {
		String palavra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a palavra");
		palavra =entrada.next();
		entrada.close();
		palavra = palavra.replaceAll("a", "@");
		System.out.println(palavra);

	}

}
