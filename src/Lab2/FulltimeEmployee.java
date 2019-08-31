
package Lab2;
public class FulltimeEmployee extends Employee{
    int salary;
    String Designation;
    FulltimeEmployee(String name,  String address,  int age,  String gender, int salary, String Designation)
    {
        super(name,  address,age,gender);
        this.salary = salary;
        this.Designation = Designation;
    }
    void print()
    {
        super.print();
        System.out.println("Salary = " + salary);
        System.out.println("Designation = " + Designation);
    }
    public static void main(String args[])
    {
        FulltimeEmployee obj = new FulltimeEmployee("Yash Saboo", "Heritage", 19, "Male", 100000000, "Chief Executive Officer" );
        obj.print();
    }
    
}
