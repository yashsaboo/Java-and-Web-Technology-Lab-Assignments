package Lab3;

import java.util.*;

class TokenizingString{
	private String str = new String("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday");
	public void revvingString(){
		StringTokenizer sto = new StringTokenizer(str,",");
		while(sto.hasMoreTokens()){
			StringBuffer temp = new StringBuffer(sto.nextToken());
			System.out.println(temp.reverse());
		}
	}
}

class q5_StringTokenizerRev{
	public static void main(String[] args){
		TokenizingString ob = new TokenizingString();
		ob.revvingString();
	}
}
