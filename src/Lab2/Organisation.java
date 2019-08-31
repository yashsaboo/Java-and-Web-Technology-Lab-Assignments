package Lab2;

public class Organisation {
    public static void main(String args[])
    {
        Employee1 obj1 = new Employee1("Yash","Male","September", "CEO","IBM");
        Employee1 obj2 = new Employee1("Yash","Male","September", "CEO","IBM");
        Employee1 obj3 = new Employee1("Yash","Male","September", "CTO","IBM");
        Student obj4 = new Student("Yash","Male","September", "2015","SIT");
        Student obj5 = new Student("Yash","Male","September", "2015","SIT");
        Student obj6 = new Student("Yash","Male","September", "2015","SITM");
        if (obj1.equals(obj2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        if (obj1.equals(obj3)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        if (obj4.equals(obj5)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        if (obj4.equals(obj6)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
    
}
