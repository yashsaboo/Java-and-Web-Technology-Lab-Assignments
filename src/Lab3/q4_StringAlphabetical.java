package Lab3;

import java.io.*;

class AlphabeticalOrder{
	private String str = new String();
	public void getString()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		str = br.readLine();
	}
	public char[] putNewString(){
		int length, i, j;
		char temp;
		char[] charArray = new char[10];
		System.out.println("Alphabetically sorting");
		length = str.length();
		charArray = str.toCharArray();
		for(i=0;i<length;i++){
			for(j=1;j<length-i;j++){
				if(charArray[j-1] > charArray[j]){
					temp = charArray[j-1];
					charArray[j-1] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		return charArray;
	}
}

class q4_StringAlphabetical{
	public static void main(String[] args)throws IOException{
		AlphabeticalOrder ob = new AlphabeticalOrder();
		ob.getString();
		System.out.println(ob.putNewString());
	}
}
