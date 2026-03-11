package curriculum.b;

public class Question4 {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		//Q1
		int[] q1 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < q1.length; i++) {
			System.out.println(q1[i]);
		}
		//Q2
		int[] q2 = { 10, 20, 30, 40, 50 };

		for (int i = q2.length - 1; i >= 0; i--) {
			System.out.println(q2[i]);
		}
		//Q3
		int[] q3 = { 3, 5, 7, 9, 11 };
		int sum = 0;

		for (int i = 0; i < q3.length; i++) {
			sum += q3[i];
		}
		System.out.println(sum);
		//Q4
		int[] q4 = { 12, 7, 9, 21, 5, 18 };
		int max = q4[0];
		int min = q4[0];

		for (int i = 0; i < q4.length; i++) {
			if (q4[i] > max) {
				max = q4[i];
			}
			if (q4[i] < min) {
				min = q4[i];
			}
		}
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
		//Q5
		int[] q5 = { 1, 2, 3, 4, 5 };

		for (int num : q5) {
			System.out.println(num * 2);
		}
		//Q6
		int[] q6 = { 4, 7, 10, 15, 20 };

		System.out.println("数値を入力してください:");
		int input = Integer.parseInt(scanner.nextLine());

		boolean found = false;

		for (int i = 0; i < q6.length; i++) {
			if (q6[i] == input) {
				found = true;
			}
		}

		if (found) {
			System.out.println("入力した値は配列に含まれています");
		} else {
			System.out.println("含まれていません");
		}
		//Q7
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		//Q8
		int[][] array2 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};

		int sum2 = 0;

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
			}
		}

		System.out.println("合計:" + sum2);
		//Q9
		int[][] array3 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};

		int max2 = array3[0][0];
		int min2 = array3[0][0];

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {

				if (array3[i][j] > max2) {
					max2 = array3[i][j];
				}

				if (array3[i][j] < min2) {
					min2 = array3[i][j];
				}
			}
		}

		System.out.println("最大値:" + max2);
		System.out.println("最小値:" + min2);
		//Q10
		int[][][] array4 = {
				{
						{ 1, 2 },
						{ 3, 4 }
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		};

		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[4].length; j++) {
				for (int k = 0; k < array4[i][j].length; k++) {

					System.out.println(array4[i][j][k]);
				}
			}
		}

	}
}
