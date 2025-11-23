package kadai_015;

public class Car_Chapter15 {


		
	// フィールド
	private int gear  = 1;   // ギア（初期値：1）
	private int speed = 10;  // 速度（初期値：10km）
		
	// ギアチェンジ処理
	public void changeGear(int afterGear) {
		int beforeGear = this.gear; // 変更前のギアを保存
		
		// ギアを変更
		this.gear = afterGear;
			
		// ギアに応じて速度を設定
		switch (afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
			
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}
		
	// 走行処理（速度の表示）
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
