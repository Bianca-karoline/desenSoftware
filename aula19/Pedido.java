package aula19;

import java.util.ArrayList;

public class Pedido {
	private int num;
	private int mesa;
	private ArrayList<Produto> itens = new ArrayList<>();
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public ArrayList<Produto> getItens() {
		return itens;
	}
	public void setItens(Produto itens) {
		this.itens.add(itens);
	}
	public void confirmarPedido() {
		for(Produto p: itens) {
			if(p instanceof Preparavel) {
				((Preparavel) p).fabricar();
			}else {
				System.out.println("A bebida " + p.getNome() + " está no balcão");
			}
		}
	}
	public void fecharPedido() {
		double conta = 0;
		for(Produto p : itens) {
			System.out.println(p.getNome() + "\tR$" + p.getValor());
			conta += p.getValor();
		}
		System.out.println("Conta da mesa: " + this.mesa + "\nValor:\t" + conta);
	}
	public void pedidosRealizados() {
		for(Produto p: itens) {
			System.out.println(p.toString());
		}
	}
	@Override
	public String toString() {
		return "Pedido [num=" + num + ", mesa=" + mesa + ", itens=" + itens + "]";
	}
	
}
