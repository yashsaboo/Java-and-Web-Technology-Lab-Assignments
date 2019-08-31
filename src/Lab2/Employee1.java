package Lab2;
public class Employee1 extends Person{
    String jobTitle;
    String org;
    Employee1(String name,String sex,String Birthday, String jobTitle,String org)
    {
        super(name,sex,Birthday);
        this.jobTitle = jobTitle;
        this.org = org;
    }
     @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Employee1)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        Employee1 e = (Employee1) o;
         
        // Compare the data members and return accordingly
        return ((e.name.equals(this.name))&&(e.sex.equals(this.sex))&&(e.Birthday.equals(this.Birthday))&&(e.jobTitle.equals(this.jobTitle))&&(e.org.equals(this.org)));
    }
    
    void print()
    {
        super.print();
        System.out.println("jobTitle = "+jobTitle);
        System.out.println("org = "+org);
    }
    public static void main(String args[])
    {
    }
    
}
