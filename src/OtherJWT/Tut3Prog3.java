package OtherJWT;

import java.io.*;
import java.util.*;

public class Tut3Prog3 {

	public static void main(String args[]) throws Exception {
		try {
			String strFile = "C:/Users/Guest1/Desktop/CIVIL.csv";

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int tokenNumber = 0;

			while ((strLine = br.readLine()) != null) {
				st = new StringTokenizer(strLine, ",");

				while (st.hasMoreTokens()) {
					tokenNumber++;
					if (tokenNumber == 1)
						System.out.println("Material :" + st.nextToken());
					if (tokenNumber == 2)
						System.out.println("Unit :" + st.nextToken());
					if (tokenNumber == 3)
						System.out.println("Rate :" + st.nextToken());
				}
				tokenNumber = 0;
			}

		} catch (Exception e) {
			System.out.println("Exception while reading the file : " + e);
		}

	}

}
