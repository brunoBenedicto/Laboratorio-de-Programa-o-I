package lista02_operadoresLogicos;
import java.util.Scanner;

public class E2Q4 {
	/*
	 * Uma forma de avaliar se uma pessoa est� acima do peso � atrav�s do calculo do
	 * �ndice IMC. Se o valor do IMC estiver acima de 25, significa que a pessoa
	 * est� acima do peso. A f�rmula �: IMC = Peso / (Altura2 ) Com base na altura e
	 * peso fornecido no console exiba uma mensagem determinando se uma pessoa est�
	 * acima do peso
	 */

	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o peso");
		peso = entrada.nextDouble();
		System.out.println("digite a altura");
		altura = entrada.nextDouble();
		entrada.close();
		imc = peso/Math.exp(altura);
		if(imc>25)
			System.out.println("acima do peso");
		else
			System.out.println("n�o est� acima do peso");

	}

}
