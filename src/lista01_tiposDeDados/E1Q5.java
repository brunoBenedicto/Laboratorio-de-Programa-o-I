package lista01_tiposDeDados;
import java.util.Scanner;

public class E1Q5 {
	/*
	 * 	Uma empresa de construção civil precisa
	    adquirir equipamentos de segurança novos
		para os seus funcionários. Os equipamentos
		necessários são classificados em
		equipamentos para proteção individual (EPI)
		e para proteção coletiva (EPC). Sabe-se que o
		gasto com EPI será de R$ 17,45 por
		funcionário e o gasto com EPC será de R$
		2.250,00 para cada grupo de 100
		funcionários. Faça um programa em Java que
		determine o custo total dos equipamentos
		baseado na quantidade de funcionários.
	 */
	public static void main(String[] args) {
		double epi = 17.45;
		double epc = 2250.00;
		int funcionarios, quantidadeEpc;
		double custoTotal;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a quantidade de funcionarios");
		funcionarios = entrada.nextInt();
		entrada.close();
		if(funcionarios%100 != 0)
			quantidadeEpc = (funcionarios/100)+1;
		else
			quantidadeEpc = funcionarios/100;
		custoTotal = (epi*funcionarios)+(quantidadeEpc*epc);
		
		System.out.println("o custo total para "+ funcionarios +" funcionarios é de" + custoTotal);
		
		
		

	}

}
