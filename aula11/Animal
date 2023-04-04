import java.util.Calendar;

public class Animal {
	private String nome;
	private double peso;
	private double altura;
	private String sexo;
	private Calendar nascimento = Calendar.getInstance();
	private String habitatNatural;
	private boolean alimento = false;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getNascimento() {
		return this.nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public String getHabitat() {
		return this.habitatNatural;
	}
	public void setHabitat(String habitat) {
		this.habitatNatural = habitat;
	}
	public boolean alimentado() {
		if(this.alimento) {
			this.alimento = false;
		}else {
			this.alimento = true;
		}
		return this.alimento;
	}
	public String toString() {
		return this.nome + "\t" + this.peso + "\t" + this.altura + "\t" + this.sexo + "\t" + this.nascimento.toString() + "\t" + this.habitatNatural;
	}
}
