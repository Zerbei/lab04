public class Personal {
    private double RATE = 0.3995;
    double creditRiskFee(int age, double capital)
    {
        double risk;
        if (age > 55) {
            risk = (age - 55) * 0.02 * capital * (RATE / 12);
        } else {
            risk = 0;
        }
        return risk;
    }
    double calculateInterest(int capital, Person person)
    {
        double interest = (capital + person.creditRiskFee) * (1 + RATE);
        return interest;
    }
}
