package simpleTableau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimplexTableau {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row, col;
		System.out.println("Enter row : ");
		row = scanner.nextInt();
		System.out.println("Enter col : ");
		col = scanner.nextInt();

		File file = new File("C:/Users/SABBIR_AHMMED/Desktop");
		Scanner sc = new Scanner(file);
		float[][] data = new float[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

		for (int k = 0; k < 100; k++) {

			// find minimum number from row 4 // index = Columns index selection
			float min = data[row - 1][0]; // index2 = row index selection
			int index = 0;
			for (int i = 0; i < row; i++) {

				if (data[row - 1][i] < data[row - 1][0]) {

					min = data[row - 1][i];
					index = i;
				}
			}
			System.out.println();
			System.out.println("Min : " + min);
			System.out.println();

			if (min >= 0) {
				break;
			}

			float a[] = new float[row - 1];
			// column 7 contains constants
			for (int i = 0; i < a.length; i++) {
				a[i] = data[i][col - 1] / data[i][index];
			}

			int index2 = 0;
			float min2 = a[0];
			for (int i = 1; i < a.length; i++) {

				if (a[0] > a[i]) {
					min2 = a[i];
					index2 = i;
				}
			}

			// create 1 of column minimum

			float temp = data[index2][index];
			for (int i = 0; i < col; i++) {
				data[index2][i] /= temp;
			}

			// create 0 of column minimum
			for (int i = 0; i < row; i++) {
				temp = data[i][0];

				for (int j = 0; j < col; j++) {

					if (index2 != i) {
						data[i][j] = data[i][j] - data[index2][j] * temp;
					}
				}
			}

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
