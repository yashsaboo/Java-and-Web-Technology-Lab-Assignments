//    Define a class called Student with the following attributes
//
//                                I.            Roll No
//
//                              II.            Name
//
//                           III.            Date of Birth
//
//                            IV.            Weight
//
//                              V.            Height
//
//                            VI.            Mark
//    Write a suitable constructor and a method to display the details of a Student objects and display roll no and the name of the students who are 19 years old are more with weight above 90.5 KG but height less than 175.0 cm 
//    Choose the sample data set in such a way that among the 10 students there are some students of the above category.

package Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9 {
    private int rollno;
    private String name;
    private int DOB;
    private int weight;
    private int height;
    private int mark;

    public Ques9() {
    }

    public Ques9(int rollno, String name, int DOB, int weight, int height, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.DOB = DOB;
        this.weight = weight;
        this.height = height;
        this.mark = mark;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public void display()
    {
        if((DOB<=1997)&&(weight<90.5)&&(height<175))
        {
            System.out.println("Name: "+name);
            System.out.println("Roll no.: "+rollno);
        }
            
    }
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Ques9 obj[] = new Ques9[10];
        System.out.println("Enter the number of details");
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            obj[i] = new Ques9();
            System.out.println(" I.Roll No");
                        obj[i].rollno=Integer.parseInt(br.readLine());
            System.out.println(" II.Name");
                        obj[i].name=br.readLine();
            System.out.println(" III.Date of Birth");
                        obj[i].DOB=Integer.parseInt(br.readLine());
            System.out.println(" IV.Weight");
                        obj[i].weight=Integer.parseInt(br.readLine());
            System.out.println(" V.Height");
                        obj[i].height=Integer.parseInt(br.readLine());
            System.out.println(" VI.Mark");
                        obj[i].mark=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++)
        {
            obj[i].display();
        }
    }
    
}
