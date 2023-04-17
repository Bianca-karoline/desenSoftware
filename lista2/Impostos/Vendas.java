package Impostos;

import java.util.ArrayList;
import java.util.Date;

public class Vendas {
	ArrayList<Double> venda = new ArrayList<>();
	ArrayList<Date> data = new ArrayList<>();
	private double excesso = 0;
	private double multa = 0;
	
	
	public void setVendas(double vendas) {
		venda.add(vendas);
		data.add(new Date());
	}
	public String getExcesso() {
		double temp=0;
		for(double a:venda) {
			if(a>500) {
				temp += (a-500);
				
			}
		}
		excesso = temp;
		multa = 0.1 * excesso;
		
		return "Excesso: " + this.excesso + "\t Multa: " + this.multa;
		
	}
}
