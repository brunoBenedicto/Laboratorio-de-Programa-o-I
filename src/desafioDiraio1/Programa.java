package desafioDiraio1;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		int diaDaSemana = 1;
		ArrayList<DiaDeAzar> diasDeAzar = new ArrayList<DiaDeAzar>();

		for (int ano = 1900; ano <= 2000; ano++) {

			for (int mes = 1; mes < 13; mes++) {
				for (int dia = 1; dia < 32; dia++) {
					if (dia == 13 && diaDaSemana % 7 == 5 && ano > 1900)
						diasDeAzar.add(new DiaDeAzar(dia, mes, ano));
					diaDaSemana++;
					if (mes == 2) 
						if (!((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))) {
							if (dia == 28)
									break;
						}else if(dia ==29)
							break;
						
					
					if (mes < 8) {
						if (mes % 2 == 0 && dia == 30)
							break;
					} else if (mes % 2 == 1 && dia == 30)
						break;

				}
			}
		}
		for (DiaDeAzar d : diasDeAzar) {
			d.ToString();
		}

	}

}
