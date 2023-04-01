package aula10;

public class Conta {
		private String numero;
		private String agencia;
		private double saldo;
		private double limite;
		
		
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getNumero() {
			return this.numero;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getAgencia() {
			return this.agencia;
		}
		public void depositar(double deposito) {
			this.saldo = deposito;
		}
		public void sacar(double saque) {
			this.saldo = this.saldo - saque;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public double getLimite() {
			return this.limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		public String toString() {
			String texto = "Número: " + this.numero +
					"\t Agencia: " + this.agencia +
					"\t Saldo: " + this.saldo +
					"\t Limite" + this.limite;
			return texto;
		}
		public void transferir(double valor) {
			this.saldo = this.saldo - valor;
		}
}
