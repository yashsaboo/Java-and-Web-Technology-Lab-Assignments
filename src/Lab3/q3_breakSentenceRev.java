package Lab3;

import java.util.*;
import java.io.*;

class BreakString{
	private String str = new String();
	public void getString()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the string: ");
		str = br.readLine();
	}
	public void breakWord(){
		StringTokenizer tok = new StringTokenizer(str);
		System.out.println("Breaking down the words");
		while(tok.hasMoreTokens()){
			System.out.println(tok.nextToken());
		}
	}
	public void reverseBrokenWords(){
		StringTokenizer tok = new StringTokenizer(str);
		System.out.println("Now reversing broken words");
		while(tok.hasMoreTokens()){
			StringBuffer temp = new StringBuffer(tok.nextToken());
			System.out.println(temp.reverse());
		}
	}
	
	
}

class q3_breakSentenceRev{
	public static void main(String[] args)throws IOException{
		BreakString ob = new BreakString();
		ob.getString();
		ob.breakWord();
		ob.reverseBrokenWords();
	}
}
