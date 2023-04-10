public class Person {
private String name;
private String surname;
int age;
private double salary;
double creditRiskFee = 0;
double interest;
double installment;
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
    double payment = month * installment;
if (b) {
    System.out.printf("Congratulations %s %s! \nYour %s credit application: %d has been accepted!\nYour monthly payment will be: %f x %d\nRepayment costs = %f\n",name,surname,loanType,capital,installment,month,payment);
} else {
    System.out.printf("We are sorry %s %s!\nYour %s credit application: %d has been rejected because your salary is lower than the installments!\nYour salary: %.1f < %f\n",name, surname,loanType,capital,salary,installment);
}
}
}