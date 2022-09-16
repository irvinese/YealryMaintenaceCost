package Lab_04_Java_Variables;

public class Lab_04_03_MonthyCCBalance {

    private static System system;

    public static void main(String[] args) {
        //write your code here
        double creditCardBalance = 5000;
        double intrestRate = .17;

        system.out.println("The intrest due after one month is" + intrestRate);
        system.out.println("the intrest due after two months is" + intrestRate + intrestRate);

    }
}
