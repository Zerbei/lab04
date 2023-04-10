public class Mortgage {
    private double RATE = 0.3005;
    double creditRiskFee(int age, double capital)
    {
        double risk;
        if (age > 55) {
            risk = (age - 55) * 0.01 * capital * (RATE / 12);
        } else {
            risk = 0;
        }
        return risk;
    }
    double calculateInterest(int capital, Person person)
    {
        double interest = (capital + person.creditRiskFee) * (0.9 + RATE);
        return interest;
    }
}