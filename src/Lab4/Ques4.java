package Lab4;

public class Ques4 {
	public static void main(String args[]) {
		double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[2]);
		double f;

		switch (args[1]) {
		case "add":
			f = n1 + n2;
			System.out.println("Final Answer is : " + f);
			break;
		case "sub":
			f = n1 - n2;
			System.out.print("Final Answer is : " + f);
			break;
		case "mul":
			f = n1 * n2;
			System.out.print("The product is : " + f);
			break;
		case "div":
			f = n1 / n2;
			System.out.print("The Quotient is : " + f);
			break;
		default:
			System.out.println("Enter the correct no.");
			break;
		}
	}
}
