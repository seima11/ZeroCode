package curriculum.b;

import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
	
//Q1
	int score = 75; //int 型の変数 score に 75 を代入
	if (score >= 60) { //score が 60 以上なら "合格です！" と表示
		System.out.println("合格です！"); 
	}
//Q2	
	int age = 25; // int 型の変数 age に 25 を代入
	if (age >= 20 && age <= 30) { //age が 20 以上 30 以下なら "適正年齢です" と表示
		System.out.println("適正年齢です");
	} else { //それ以外の場合は "対象外です" と表示
		System.out.println("対象外です");
	}
//Q3	
	int age1 = 18;
	if (age1 >= 20) {
		System.out.println("成人です");
	} else if(age1 >= 13 && age1 <= 19) {
		System.out.println("ティーンエイジャーです");
	} else {	
		System.out.println("子供です");
	}
//Q4
	int x = 30;
	int y = 15;
	int z = 50;
	if (x >= y && x >= z) {
		System.out.println(x);
	}
//Q5
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt( sc.nextLine());
	if (num > 0) {
		System.out.println("正の数です");
	}else if (num == 0) {
		System.out.println("0です");
	}else {
		System.out.println("負の数です");
	}
//Q6
	int varue = Integer.parseInt(sc.nextLine());
	if (varue % 2 == 0) {
		System.out.println("偶数です");
	} else {
		System.out.println("奇数です");
	}
//Q7
	int score1 = Integer.parseInt(sc.nextLine());
	if (score1 >= 90) {
		System.out.println("優");
	} else if (score1 >= 70) {
		System.out.println("良");
	} else if (score1 >= 50) {
	   System.out.println("可");
	} else {
		System.out.println("不可");
	}
//Q8
	String inport = sc.nextLine();
	if (inport == null || inport.equals("")){
		System.out.println("入力が無効です");
	}
//Q9
	int day = Integer.parseInt(sc.nextLine());
	switch (day) {
	case 1:
		System.out.println("月曜日");
		break;
	case 2:
		System.out.println("火曜日");
		break;
	case 3:
		System.out.println("水曜日");
		break;
	case 4:
		System.out.println("木曜日");
		break;
	case 5:
		System.out.println("金曜日");
		break;
    case 6:
    	System.out.println("土曜日");
    	break;
	case 7:
		System.out.println("日曜日");
		break;
	default:
		System.out.println("無効な入力です");
	}
//Q10
	int mouth = Integer.parseInt(sc.nextLine());
	switch (mouth) {
	    case 12:
	    case 1:
	    case 2:
	    	System.out.println("冬");
	    	break;
	    case 3:
	    case 4:
	    case 5:
	    	System.out.println("春");
	    	break;
	    case 6:
	    case 7:
	    case 8:
	    	System.out.println("夏");
	    	break;
	    case 9:
	    case 10:
	    case 11:
	    	System.out.println("秋");
	    	break;
	    default:
	    	System.out.println("無効な月です");
	}
	sc.close(); 
	}
}
