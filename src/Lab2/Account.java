
package Lab2;

public class Account {
    String Cust_name;
    int acct_no;
    Account(String a, int b)
    {
        Cust_name = a;
        acct_no = b;
    }
    void print()
    {
        System.out.println("Customer Name = " + Cust_name);
        System.out.println("Account = " + acct_no);
    }
    public static void main(String args[])
    {
    }
}

