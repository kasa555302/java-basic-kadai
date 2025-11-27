package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//辞書として使う HashMap
	private HashMap<String, String> dictionary = new HashMap<>();
	
	//コンストラクタで英単語と意味を追加
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	// 調べた単語の意味を出力するメソッド
	public void searchWords(String[] words) {
		
		for (String word : words) {		// 単語の数だけ繰り返す
			if (dictionary.containsKey(word)) {		// 辞書にある？
				String result = dictionary.get(word);	// 意味を取得
				System.out.println(word + "の意味は" + result);
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}

}
