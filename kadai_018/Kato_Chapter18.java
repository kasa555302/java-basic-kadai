package kadai_018;

public abstract class Kato_Chapter18 {
		
	public String familyName;	// 姓を表す
	public String givenName;		// 名を表す	
	public String address;	// 住所を表す
	
	// 共通紹介
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName +"です");
		System.out.println("住所は" + address + "です");
	}
	
//	個別紹介（象徴メソッド）
	public abstract void eachIntroduce();
	
//	紹介を実行
	public void	 execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
		
}
