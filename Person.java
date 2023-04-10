public class Person {
private String name;
private String surname;
private int age;
private double salary;
double creditRiskFee;
private double interest;
private double installment;
Person(String name, String surname, int age, int salary)
{
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
}
void applyForLoan(Person p, int capital, int month, String loanType){
    switch (loanType) {
        case "Mortgage":
        Mortgage mortgage = new Mortgage();
        creditRiskFee = mortgage.creditRiskFee(p.age, capital);
        interest = mortgage.calculateInterest(capital, p);
        break;
        
        case "Vehicle":
        Vehicle vehicle = new Vehicle();
        creditRiskFee = vehicle.creditRiskFee(p.age, capital);
        interest = vehicle.calculateInterest(capital, p);
        break;
        
        case "Personal":
        Personal personal = new Personal();
        creditRiskFee = personal.creditRiskFee(p.age, capital);
        interest = personal.calculateInterest(capital, p);
        break;
        
        default:
        break;
    }
    installment = interest / month;
    boolean b = (salary > installment);
    printCreditResult(b, capital, p, installment, month, loanType);
}
void printCreditResult(Boolean b, int capital, Person person, double installment, int month, String loanType){
if (b) {
    System.out.printf("Congratulations %s %s! \n Your %s credit application: %d has been accepted!\n Your monthly payment will be: %f x %d \n Repayment costs = %f\n",name,surname,loanType,capital,installment,month,(month*installment));
} else {
    System.out.println("deneme");
}
}
}