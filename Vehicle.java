public class Vehicle {
    private double RATE = 0.3495;
    double creditRiskFee(int age, double capital)
    {
        double risk = 0.01 * capital * (RATE / 12);
        if ((age >= 35) && (age <= 60)) {
            risk = 0;
        }
        return risk;
    }
    double calculateInterest(double capital, Person person)
    {
        double interest = (capital + person.creditRiskFee) * (1 + RATE);
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
        System.out.printf("New Personal Loan Repayment will be : %f \nYour new payments will be: %f x %d\n",total,person.installment,newMonthNumber);
    }
}

