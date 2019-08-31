
package Lab2;

public class Employee {
    String name;
    String address;
    int age;
    String gender;
    Employee(String name,   String address,    int age,    String gender)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    void print()
    {
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
    }
    public static void main(String args[])
    {
    }
}
