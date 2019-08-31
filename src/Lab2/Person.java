
package Lab2;

public class Person {
    String name;
    String sex;
    String Birthday;
    Person(String name,String sex,String Birthday)
    {
        this.name=name;
        this.sex=sex;
        this.Birthday=Birthday;
    }
    void print()
    {
        System.out.println("Name = "+name);
        System.out.println("Sex = "+sex);
        System.out.println("Birthday = "+Birthday);
    }
    public static void main(String args[])
    {
    }
}
