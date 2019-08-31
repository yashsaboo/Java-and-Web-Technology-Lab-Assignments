package OtherJWT;

import java.util.StringTokenizer;

public class StringReversal implements Reversal{

	@Override
	public String reversal(String x) {
		{
			String reverse="";
			for(int i=x.length()-1;i>=0;i--)
			{
				reverse+=x.charAt(i);
			}
			
			return reverse;
		}
	}
	
	public String toString()
	{
		return "In StringReversal";
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello Reverse: "+new StringReversal().reversal("Hello"));
		StringReversal obj = new StringReversal();
		System.out.println(obj);
		
		StringBuffer sb = new StringBuffer();
	}

}
