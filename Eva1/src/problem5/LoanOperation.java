package problem5;

public class LoanOperation {
	public static double getEMIByFlatRate(Loan loan) {
        double totalAmount = loan.getPrincipleAmount() * (1 + loan.getInterestRate()/100 * loan.getTimePeriod());
        double emi = totalAmount / (loan.getTimePeriod() * 12);
        return emi;
    }

    public static double getEMIByFloatingRate(Loan loan) {
        double r = loan.getInterestRate() / (12 * 100); 
        double n = loan.getTimePeriod() * 12; 
        double nume = loan.getPrincipleAmount() * r * Math.pow(1 + r, n);
        double deno = Math.pow(1 + r, n) - 1;
        double emi = nume / deno;
        return emi;
    }
}
