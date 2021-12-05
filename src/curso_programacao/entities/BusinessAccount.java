package curso_programacao.entities;

public class BusinessAccount extends Account{

	private Double loanLimit;

	public BusinessAccount() {
		
	}
	
	public BusinessAccount(int number, String holder) {
		super(number, holder);
		// TODO Auto-generated constructor stub
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
}
