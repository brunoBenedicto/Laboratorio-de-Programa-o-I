package va2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Va2 {
	public static void main(String args[]) throws Exception {

		FileInputStream leitor = new FileInputStream("input.txt");
		InputStreamReader arquivo = new InputStreamReader(leitor);
		BufferedReader br = new BufferedReader(arquivo);

		FileOutputStream saida = new FileOutputStream("output.txt");
		PrintWriter pw = new PrintWriter(saida);

		String l = br.readLine();
		int t = Integer.parseInt(l); // quantidade de testes no arquivo
		String teste = null;

		while (t-- != 0) {
			teste = br.readLine();
			char[] aux = teste.toCharArray();
			int resposta = (Integer.parseInt(String.valueOf(aux[0])) - 1)
					* (Integer.parseInt(String.valueOf(aux[2])) - 1);
			System.out.println(resposta);
			pw.println(resposta);
		}

		pw.close();
		saida.close();
		br.close();
		arquivo.close();

	}
}
