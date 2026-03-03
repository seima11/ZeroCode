package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		//Q1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//Q2
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		//Q3
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		//Q4
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		//Q5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Q6
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		//Q7
		int i1 = 1;
		while (i1 <= 20) {
			if (i1 % 2 == 0) {
				System.out.println(i1);
			}
			i1++;
		}
		//Q8
		int i2 = 10;
		while (i2 >= 1) {
			System.out.println(i2);
			i2--;
		}
		//Q9
		int sum1 = 0;
		int i3 = 1;
		while (i3 <= 100) {
			sum1 += i3;
			i3++;
		}
		System.out.println(sum1);
		//Q10
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while (num != 0) {
			System.out.print("半角数字を入力してください");
			num = Integer.parseInt(sc.nextLine());
		}
		System.out.println("終了しました");
		//Q11
		for (int i4 = 1; i4 <= 9; i4++) {
			for (int j1 = 1; j1 <= 9; j1++) {
				System.out.printf("%02d * %02d = %02d ||", i4, j1, i4 * j1);
			}
			System.out.println();
		}
		//Q12
		Random rand = new Random();

		System.out.println("商品を入力してください:");
		String input = sc.nextLine();
		String[] items = input.split("、"); //入力された文字列を「、」で分配して配列にする
		int tvStock = rand.nextInt(12); //0-11
		int displayStock = 11 - tvStock;
		for (String item : items) {
			int randomStock = rand.nextInt(12); //0-11のランダム

		switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(item + "残りの台数は" + randomStock + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				int stock = item.equals("テレビ") ? tvStock : displayStock;
				System.out.println(item + "残りの台数は" + stock + "台です");
				break;
			default:
				System.out.println(item + "は指定の商品ではありません");
				break;
			}
		}
		sc.close();
	}
}