
package Lab2;
public class commissionEmployee extends Employee {
    int commissionAmountonSale;
    int ratePerHour;
    commissionEmployee(String name,  String address,  int age,  String gender, int commissionAmountonSale)
    {
        super(name,address,age,gender);
        this.commissionAmountonSale = commissionAmountonSale;
    }
    int calculatePay()
    {
        return commissionAmountonSale;
    }
    void print()
    {
        super.print();
        System.out.println("Commission Amount on Sale = " + calculatePay());
    }
    public static void main(String args[])
    {
        commissionEmployee obj = new commissionEmployee("Yash Saboo", "Heritage", 19, "Male", 300000 );
        obj.print();
    }
}
