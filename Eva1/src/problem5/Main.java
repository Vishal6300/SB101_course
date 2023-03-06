package problem5;

public class Main {
	public static void main(String[] args) {
	       
        MyLoanIntr createLoan = Loan::new;
        Loan loan = createLoan.createLoan(150000, 3, 8.5);

       
        GetEMIAmount emiFlatRate = LoanOperation::getEMIByFlatRate;
        
        double emiFlat = emiFlatRate.getEMI(loan);
        System.out.println("EMI's Flat Rate: " + emiFlat);

        
        GetEMIAmount emiFloatingRate = LoanOperation::getEMIByFloatingRate;
        double emiFloating = emiFloatingRate.getEMI(loan);
        System.out.println("EMI's Floating Rate: " + emiFloating);
    }
}
