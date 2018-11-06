package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q3 {

	public static void main(String[] args) {
		/*
		 * a velocidade máxima permitida em uma via e a velocidade que o motorista
		 * estava dirigindo nela. Calcule a multa que uma pessoa vai receber, sabendo
		 * que são pagos: – a) R$ 100 reais se o motorista ultrapassar em até 10km/h a
		 * velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a
		 * 56km/h); – b) 200 reais, se o motorista ultrapassar de 11 a 30 km/h a
		 * velocidade permitida. – c) 500 reais, se estiver acima de 31km/h da
		 * velocidade permitida.
		 */
		
		int velocidadeMaximaPermitida, velocidadeAtual, excesso;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a velocidade maxima permitida");
		velocidadeMaximaPermitida = entrada.nextInt();
		System.out.println("digite a velocidade atual");
		velocidadeAtual = entrada.nextInt();
		entrada.close();
		excesso = velocidadeAtual - velocidadeMaximaPermitida;
		if(excesso <=0) 
			System.out.println("na velocidade permitida");
		else
			if(excesso <= 10)
				System.out.println("multa de 100");
			else
				if(excesso <= 30)
					System.out.println("multa de 200");
				else
					System.out.println("multa de 500");
		
		
	}

}
