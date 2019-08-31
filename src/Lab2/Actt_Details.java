package Lab2;

public class Actt_Details extends saving_acc {
     int Deposits;
    int withdrawl;
    Actt_Details(int a, int b, String Cust_name, int acct_no, int Min_bal, int saving_bal)
    {
        super( Min_bal,saving_bal, Cust_name, acct_no);
        Deposits = a;
        withdrawl = b;
    }
    void print()
    {
        super.print();
        System.out.println("Deposits = " + Deposits);
        System.out.println("Withdrawl = " + withdrawl);
    }
    public static void main(String args[])
    {
        Actt_Details obj = new Actt_Details(20000, 10000, "Yash Saboo", 1234567, 500, 200);
        obj.print();
    }
}
