package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンス生成
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセット
		String[] words = { "applle", "banana", "grape", "orange" };
		
		// 辞書を調べる英単語を配列にセット
		dic.searchWords(words);

	}

}
