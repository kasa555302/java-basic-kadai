package kadai_015;

public class CarExec_Chapter15 {
	
	public static void main(String[] args) {
		// 車のインスタンスを作成
		Car_Chapter15 myCar = new Car_Chapter15();
		
		// ギアを3に変更
		myCar.changeGear(3);
		
		// 走行速度を表示
		myCar.run();
	}

}
