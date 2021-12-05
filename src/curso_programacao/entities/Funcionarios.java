package curso_programacao.entities;

public class Funcionarios {

	private String nome;
	private int hours;
	private Double value;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, int hours, Double value) {
		this.nome = nome;
		this.hours = hours;
		this.value = value;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double payment() {
		return hours * value;
	}
	
}
