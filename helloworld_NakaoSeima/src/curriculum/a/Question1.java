package curriculum.a;

public class Question1 {
 public static void main(String[] args) {
 //Q1
	 // 変数byteNumの初期値を設定
	 byte byteNum = 0;
	 //変数shortNumの初期値を設定
	 short shortNum = 0;
	 //変数intNumの初期値を設定
	 int intNum = 0;
	 //変数longNumの初期値を設定
	 long longNum = 0L;
	 //変数floatNumの初期値を設定
	 float floatNum = 0.0f;
	 //変数doubleNumの初期値を設定
	 double doubleNum = 0.0;
	 //変数letterの初期値を設定
	 char letter = '\u0000';
	 //変数lettersの初期値を設定
	 String letters = null;
	 //変数isBooleanの初期値を設定
	 boolean isBoolean = false;
	 
	 //Q2
	 byteNum = 10; //byteNumに10を代入
	 System.out.println(byteNum);
	 shortNum = 100; //shortNumに100を代入
	 System.out.println(shortNum);
	 intNum = 1000; //intNumに1000を代入
	 System.out.println(intNum);
	 longNum = 10000; //longNumに10000を代入
	 System.out.println(longNum);
	 floatNum = 9.5f; //floatNumに9.5fを代入
	 System.out.println(floatNum);
	 doubleNum = 10.5; //doubleNumに10.5を代入
	 System.out.println(doubleNum);
	 letter = 'a'; //letterにaを代入
	 System.out.println(letter);
	 letters = "ハロー"; //lettersにハローを代入
	 System.out.println(letters);
	 isBoolean = true; //isBooleanにtrueを代入
	 System.out.println(isBoolean);
	 
	 //Q3
	 //11110を出力
	 System.out.println(byteNum + shortNum + intNum + longNum);
	 //20を出力
	 System.out.println(byteNum + byteNum);
	 //a ハロー　trueを出力
	 System.out.println(letter + letters + isBoolean);
	 //11130を出力
	 System.out.println(longNum + intNum + shortNum + byteNum + byteNum + byteNum);
	 //10000000000を出力
	 System.out.println(byteNum  * shortNum * intNum * longNum);
	 //0.105を出力
	 System.out.println(doubleNum / shortNum);
	 //-90を出力
	 System.out.println(byteNum - shortNum);
	 
	 //Q4
	 String name = "山田太郎"; //nameに山田太郎を代入
	 System.out.println("こんにちは、" + name + "さん！");
	 
	 //Q5
	 int age = 25; //ageに25代入
	 System.out.println("年齢:" + age + "歳");
	 
	 //Q6
	 int num1 = 10; //num1に10代入
	 int num2 = 5; //num2に5代入
	 int sum = num1 + num2; //num1とnum2を足す
	 System.out.println(sum);
	 
	 //Q7
	 int score = 80; //scoreに80代入
	 System.out.println(score + 20);
	 
	 //Q8
	 double price = 99.99; //priceに99.99代入
	 int i = (int)price; //double→intへ置き換え
	 System.out.println(i);
	 
	 //Q9
	 String numStr = "123"; //numStrに"123"代入
	 int num3 = Integer.parseInt(numStr); //numStrをintに変換
	 System.out.println(num3 + 10);
	 
	 //Q10
	 int num =50; //numに50代入
	 String str = String.valueOf(num); //numをStringに変換
	 System.out.println("得点:" + str + "点");
	 
	 //Q11
	 int a = 10; //aに10代入
	 int b = 20; //bに20代入
	 boolean result = (a < b); //a が b より小さいかどうか
	 System.out.println(result);
	 
	 //Q12
	 int x = 15; //xに15を代入
	 String rs = (x >= 10) ? "OK" : "NG"; //x が 10 以上なら "OK"、そうでなければ "NG"
	 System.out.println(rs);
	 
	 //Q13
	 String text = "私はJavaが好きです。Javaは楽しい！";
	 String text1 = text.replace("Java","Python"); //javaをPythonに変更
	 System.out.println(text1);
	 }
}

