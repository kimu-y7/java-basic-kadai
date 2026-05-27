package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void dictCheck(String[] keyDataArray) {

		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> dictionary = new HashMap<String,String>();

		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		for(String keyData : keyDataArray) {
			String val = dictionary.get(keyData);
			if(val != null) {
				System.out.println(keyData + "の意味は" + val + "です");
			}else {
				System.out.println(keyData + "は辞書にないです");
			}
		}
	}
}
