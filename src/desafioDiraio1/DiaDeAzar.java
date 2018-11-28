package desafioDiraio1;

public class DiaDeAzar {
	
	private Mes mes;
	private int diaDoMes;
	private int ano;
	
	public DiaDeAzar(int diaDoMes, int mes, int ano) {
		switch(mes) {
		case 1: 
			this.mes = Mes.Janeiro ;
			break;
		case 2: 
			this.mes = Mes.Fevereiro ;
			break;
		case 3: 
			this.mes = Mes.Marco ;
			break;
		case 4: 
			this.mes = Mes.Abril ;
			break;
		case 5: 
			this.mes = Mes.Maio ;
			break;
		case 6: 
			this.mes = Mes.Junho ;
			break;
		case 7: 
			this.mes = Mes.Julho ;
			break;
		case 8: 
			this.mes = Mes.Agosto ;
			break;
		case 9: 
			this.mes = Mes.Setembro ;
			break;
		case 10: 
			this.mes = Mes.Outubro ;
			break;
		case 11: 
			this.mes = Mes.Novembro ;
			break;
		case 12: 
			this.mes = Mes.Dezembro ;
			break;
		
		
			
		}
		this.diaDoMes = diaDoMes;
		this.ano = ano;
	}
	
	public void ToString() {
		System.out.println( diaDoMes +" de " + mes.name()+ " de " + ano);
	}
}
