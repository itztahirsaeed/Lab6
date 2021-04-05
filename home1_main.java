package lab6;

public class home1_main {
	public static void main(String args[]) {
        home1_class s1= new home1_class(12000);
        home1_class s2= new home1_class(30000);
        home1_class.setInterestRate(3);
        s1.calculateMonthlyRate();
        s1.printBalance();
        s2.calculateMonthlyRate();
        s2.printBalance();
        
        home1_class.setInterestRate(4);
        s1.calculateMonthlyRate();
        s1.printBalance();
        s2.calculateMonthlyRate();
        s2.printBalance();
    }
}
