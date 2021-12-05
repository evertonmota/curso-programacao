package curso_programacao.entities;

public class FuncionariosTerceirizados extends Funcionarios {

	
	private Double additionalCharge;

	public FuncionariosTerceirizados(String nome, int hours, Double value, Double additionalCharge) {
		super(nome, hours, value);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}


	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
}
