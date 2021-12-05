package curso_programacao.entities;

public class SavingsAccount extends Account{

	private Double interestRate;

	public SavingsAccount() {
		
	}
	
	public SavingsAccount(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public SavingsAccount(int number, String holder) {
		super(number, holder);
		// TODO Auto-generated constructor stub
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
}
