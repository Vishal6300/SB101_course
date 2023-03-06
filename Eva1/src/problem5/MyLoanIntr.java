package problem5;

@FunctionalInterface
 interface MyLoanIntr {
    Loan createLoan(double principleAmount, double timePeriod, double interestRate);
}
