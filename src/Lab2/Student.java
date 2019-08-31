
package Lab2;

public class Student extends Person{
    String year;
    String inst;
    Student(String name,String sex,String Birthday, String year,String inst)
    {
        super(name,sex,Birthday);
        this.year = year;
        this.inst = inst;
    }
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Student)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        Student e = (Student) o;
         
        // Compare the data members and return accordingly
        return ((e.name.equals(this.name))&&(e.sex.equals(this.sex))&&(e.Birthday.equals(this.Birthday))&&(e.year.equals(this.year))&&(e.inst.equals(this.inst)));
    }
    
    void print()
    {
        super.print();
        System.out.println("Year = "+year);
        System.out.println("Institute = "+inst);
    }
    public static void main(String args[])
    {
    }
}
