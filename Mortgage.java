public class Mortgage {
    private double RATE = 0.3005;
    double creditRiskFee(int age, double capital)
    {
        double risk = 0;
        if (age > 55) {
            risk = (age - 55) * 0.01 * capital * (RATE / 12);
        }
        return risk;
    }
    double calculateInterest(double capital, Person person)
    {
        double interest = (capital + person.creditRiskFee) * (0.9 + RATE);
        person.interest = interest;
        return interest;
    }
    public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments){
        double total = 0;
        // burda int double falan sakat ama hoca oyle yapmis bilemem
        for (double d : remainingInstallments) {
            total += d;
        }
        person.creditRiskFee = creditRiskFee(person.age, total);
        total = calculateInterest(total, person);
        person.installment  = total / newMonthNumber;
        System.out.printf("New Mortgage Loan Repayment will be : %f \nYour new payments will be: %f x %d\n",total,person.installment,newMonthNumber);
    }
}