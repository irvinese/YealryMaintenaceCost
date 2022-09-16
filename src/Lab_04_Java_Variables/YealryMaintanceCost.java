package Lab_04_Java_Variables;

class Lab_04_02_YearlyMaintenanceCost {
    private static System system;

    public static void main(String[] args)  {
    //write your code here
        double springCost = 100.0;
        double summerCost = 75.75;
        double fallCost = 105.43;
        double winterCost = 99.99;
        double totalYearlyMaintenanceCost;

        totalYearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        system.out.println("The total yealry maintance cost is" + totalYearlyMaintenanceCost);

    }
}
