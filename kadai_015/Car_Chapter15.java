package kadai_015;

public class Car_Chapter15 {
	//フィールド（内部データ）
			private int gear = 1; //1速から5速のギアを表す
			private int speed = 10; //ギアチェンジ後の速度を表す
	
	//ギアの値により速度を変える
	public void changeGear (int afterGear) {
		switch(afterGear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		}
		
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
	}
	
	//ギアチェンジ後の速度を表示する
	public void run () {
		
		System.out.println("速度は時速" + speed + "kmです");
	}
	
}
