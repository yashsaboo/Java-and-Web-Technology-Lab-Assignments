
package Lab2;

public class ParttimeEmployee extends Employee{
    int workingHours;
    int ratePerHour;
    ParttimeEmployee(String name,  String address,  int age,  String gender, int workingHours, int ratePerHour)
    {
        super(name,address,age,gender);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    int calculatePay()
    {
        return workingHours*ratePerHour;
    }
    void print()
    {
        super.print();
        System.out.println("Working Hours = " + workingHours);
        System.out.println("Rate per Hour = " + ratePerHour);
        System.out.println("Total Pay = " + calculatePay());
    }
    public static void main(String args[])
    {
        ParttimeEmployee obj = new ParttimeEmployee("Yash Saboo", "Heritage", 19, "Male", 50, 2000 );
        obj.print();
    }
}
