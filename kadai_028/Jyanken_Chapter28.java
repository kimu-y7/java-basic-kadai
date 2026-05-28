package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice () {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		try (//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in)) {
			//正しいじゃんけんの手か判定する。trueになるまでまわす
			while(true) {
			
				String input= scanner.next();
			
				if (input.equals("r") || input.equals("s") || input.equals("p")) {
				//じゃんけんクラスを実行するクラス(JyankenExec_Chapter28)に、自分のジャンケンの手(input)を返す
				return input;
				} 
				
				//エラーを出力し、再度自分のじゃんけんの手を選ぶ
				System.out.println("正しいじゃんけんの手を入力してください");
				
			
			}
		}
		
		//入力した内容を取得する
		//String input= scanner.next();

	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom () {
		String [] aite = {"r","s","p"};

		int no1 =(int)Math.floor(Math.random() * 3);
		
		return aite [no1];
	}
	
	//じゃんけんを行うメソッド
	public void playGame () {
		
		String jibun = getMyChoice ();
		String teki =getRandom ();
		
		HashMap<String,String> play = new HashMap<String,String>();
		play.put("r","グー");
		play.put("s","チョキ");
		play.put("p","パー");
		
		System.out.println("自分の手は" + play.get(jibun) + "対戦相手の手は" + play.get(teki));
		
		if(jibun.equals(teki)) {
			System.out.println("あいこです");
		} else if (
				(jibun.equals("r") && teki.equals("s")) ||
				(jibun.equals("s") && teki.equals("p")) ||
				(jibun.equals("p") && teki.equals("r"))     ){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
