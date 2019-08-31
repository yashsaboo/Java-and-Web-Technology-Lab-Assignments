package Lab3;

//Reversing a string using recursion and not using inbuilt reverse function

import java.io.*;

class RecursiveRev{
	private String str = new String();
	private static char[] charArray = new char[20];
	private int length;
	private static char temp;
	public void doReverse()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		str = br.readLine();
		length = str.length();
		charArray = str.toCharArray();
		reverse(0,length-1);
	}
	private static void reverse(int first, int last){
		if((first+last)%2 == 0){
			if(first != last){
				reverse(first+1,last-1);
			}
			temp = charArray[first];	
			charArray[first] = charArray[last];
			charArray[last] = temp;	
		}
		else{
			if(first != last+1){
				reverse(first+1,last-1);
			}
			temp = charArray[first];
			charArray[first] = charArray[last];
			charArray[last] = temp;		
		}
	}
	public char[] getReverse(){
		return charArray;
	}
}

class q6_RecursiveReverse{
	public static void main(String[] args)throws IOException{
		RecursiveRev ob = new RecursiveRev();
		ob.doReverse();
		System.out.println(ob.getReverse());
	}
}
