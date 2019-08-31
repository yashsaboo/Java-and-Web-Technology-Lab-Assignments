
package Lab2;

public class saving_acc extends Account {
    int Min_bal;
    int saving_bal;
    saving_acc(int a, int b, String Cust_name, int acct_no)
    {
        super(Cust_name, acct_no);
        Min_bal = a;
        saving_bal = b;
    }
    void print()
    {
        super.print();
        System.out.println("Minimum Balance = " + Min_bal);
        System.out.println("Saving Balance = " + saving_bal);
    }
    public static void main(String args[])
    {
    }
}