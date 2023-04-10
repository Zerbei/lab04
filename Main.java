public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", "Irmak", 36, 5000);
        Person person2 = new Person("Veli", "Kaya", 61, 3500);
        person1.applyForLoan(person1,100000,6,"Mortgage");
        person1.applyForLoan(person1,10000,6,"Mortgage");
        person2.applyForLoan(person2, 50000, 12, "Vehicle");
        person2.applyForLoan(person2, 50000, 24, "Vehicle");
        person1.applyForLoan(person2, 50000, 12, "Personal");
        person1.applyForLoan(person2, 50000, 24, "Personal");
        }
}
