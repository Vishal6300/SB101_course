package problem5;

public class Loan {
	private double principleAmount;
	private double timePeriod;
	private double interestRate;
	
	@Override
	public String toString() {
		return "Loan [principleAmount=" + principleAmount + ", timePeriod=" + timePeriod + ", interestRate="
				+ interestRate + "]";
	}
	public Loan(double principleAmount, double timePeriod, double interestRate) {
		super();
		this.principleAmount = principleAmount;
		this.timePeriod = timePeriod;
		this.interestRate = interestRate;
	}
	public double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public double getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(double timePeriod) {
		this.timePeriod = timePeriod;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
