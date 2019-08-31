
package Lab4;

public class Ques8 {
	public static void main(String args[]) {
		int i, j, k;
		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat2[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		// Matrix A
		System.out.println("\nMatrix A:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print("\t" + mat1[i][j]);
			System.out.println("");
		}

		// Matrix B
		System.out.println("\nMatrix B:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print("\t" + mat2[i][j]);
			System.out.println("");
		}
		System.out.println("\nOperation ON Matrices \n1.Addition \n");
		int sum[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print("\t" + sum[i][j]);
			}

			System.out.println("");
		}

		System.out.println("2.Subtraction\n");
		int diff[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				diff[i][j] = mat1[i][j] - mat2[i][j];
				System.out.print("\t" + diff[i][j]);
			}
			System.out.println("");
		}

		System.out.println("3. Transpose Of A\n");
		int trans[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				trans[i][j] = mat1[j][i];
				System.out.print("\t" + trans[i][j]);
			}
			System.out.println("");
		}
		System.out.println("4.Multiplication\n");
		int prod[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				prod[i][j] = 0;
				{
					for (k = 0; k < 3; k++)
						prod[i][j] = prod[i][j] + mat1[i][k] * mat2[k][j];
				}
				System.out.print("\t" + prod[i][j]);
			}
			System.out.println("");

		}
	}
}
