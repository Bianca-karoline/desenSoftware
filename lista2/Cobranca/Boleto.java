package Cobranca;

public class Boleto {
	private double boleto;
	private double total;
	private int dias;
	
	public void setBoleto(double boleto) {
		this.boleto = boleto;
	}
	public void setDias(int dias) {
		this.dias =dias;
	}
	public String total() {
		if(dias != 0) {
			total = boleto * 1.05;
			for(int i = 0; i<dias; i++) {
				total = total * 1.01;
			}
		}else {
			total = boleto;
		}
		return "Boleto no valor de R$ " + this.boleto + " com " + this.dias + "dias de atraso deve ser recalculado em R$ " + this.total;
	}
}
