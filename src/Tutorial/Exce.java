package Tutorial;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exce {
public static void main(String[] args)throws IOException,ExceptionA {
	BufferedReader ob=new BufferedReader((new InputStreamReader(System.in)));
	
		System.out.println("Enter the choice");double res=0,l,b,h,r;
		int ch=Integer.parseInt(ob.readLine());
		switch(ch)
		{
		case 1:System.out.println("Enter the length");
		 l=Double.parseDouble(ob.readLine());
		res=l*l*l;break;
		
		case 2:System.out.println("Enter lenght,breadth,height");
		l=Double.parseDouble(ob.readLine());
		b=Double.parseDouble(ob.readLine());
		h=Double.parseDouble(ob.readLine());
		res=l*b*h;break;
		case 3:System.out.println("Enter the radius");
		 r=Double.parseDouble(ob.readLine());
		res=4/3*3.14*r*r*r;break;
		case 4:System.out.println("Enter the radius and height");
		r=Double.parseDouble(ob.readLine());
		h=Double.parseDouble(ob.readLine());;
		res=3.14*r*r*h;break;
		default:System.out.println("Wrong choice");
		break;
		
		}
		String result = String.format("%.3f", res);
		
		res=Double.parseDouble(result);
		if(res==0)
			throw new ExceptionA("java.lang.NumberFormatException: All the values must be positive");
		else
			System.out.printf("Value: %.3f", res);
	
	
	
}
}