package lista01_tiposDeDados;
import java.util.Scanner;

public class E1Q5 {
	/*
	 * 	Uma empresa de constru��o civil precisa
	    adquirir equipamentos de seguran�a novos
		para os seus funcion�rios. Os equipamentos
		necess�rios s�o classificados em
		equipamentos para prote��o individual (EPI)
		e para prote��o coletiva (EPC). Sabe-se que o
		gasto com EPI ser� de R$ 17,45 por
		funcion�rio e o gasto com EPC ser� de R$
		2.250,00 para cada grupo de 100
		funcion�rios. Fa�a um programa em Java que
		determine o custo total dos equipamentos
		baseado na quantidade de funcion�rios.
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
		
		System.out.println("o custo total para "+ funcionarios +" funcionarios � de" + custoTotal);
		
		
		

	}

}
