package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		// 太郎
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.familyName = "加藤";
		taro.setGivenName();
		taro.address = "東京都中野区〇×";
		taro.execIntroduce();
		
		// 一郎
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.familyName = "加藤";
		ichiro.setGivenName();
		ichiro.address = "東京都中野区〇×";
		ichiro.execIntroduce();
		
		// 花子
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.familyName = "加藤";
		hanako.setGivenName();
		hanako.address = "東京都中野区〇×";
		hanako.execIntroduce();

	}

}
