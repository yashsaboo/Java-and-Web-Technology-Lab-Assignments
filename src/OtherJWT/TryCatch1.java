package OtherJWT;

public class TryCatch1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(2/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
