public class Vehicle {
    private double RATE = 0.3495;
    double creditRiskFee(int age, double capital)
    {
        double risk;
        if ((age >= 35) && (age <= 60)) {
            risk = 0;
        } else {
            risk = 0.01 * capital * (RATE / 12);
        }
        return risk;
    }
    double calculateInterest(int capital, Person person)
    {
        double interest = (capital + person.creditRiskFee) * (1 + RATE);
        return interest;
    }
}

