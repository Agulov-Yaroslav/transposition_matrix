package transposition_matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {
		System.out.println("Введите количество строк матрицы: ");
		int length = valid();
		System.out.println("Введите количество столбцов матрицы: ");
		int width = valid();
		System.out.println("Исходная матрица: ");
		int[][] matrix = generateMatrix(length, width);
		System.out.println("Транспонированная матрица: ");
		transposeMatrix(width, length, matrix);

		scanner.close();

	}

	public static int valid() {
		String fail = "Введите целое положительное число. ";
		int user = 1;
		boolean loop = true;
		while (loop) {
			try {
				user = scanner.nextInt();
				if (user < 1)
					System.out.print(fail);
				else
					loop = false;

			} catch (InputMismatchException e) {
				System.out.print(fail);
				scanner.next();
			}
		}

		return user;
	}

	public static int[][] generateMatrix(int length, int width) {
		int[][] matrix = new int[length][width];
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		return matrix;

	}

	public static int[][] transposeMatrix(int length, int width, int[][] matrix) {
		int[][] matrix2 = new int[length][width];
		for (int i = 0; i < matrix2.length; i++) {

			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = matrix [j][i];
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.println();
		}
		return matrix2;
	}
}
