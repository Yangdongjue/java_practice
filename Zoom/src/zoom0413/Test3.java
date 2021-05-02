package zoom0413;
abstract class PairMap {
	protected String keyArray []; // key들을 저장하는 배열
	protected String valueArray []; // value 들을 저장하는배열
	abstract String get(String key); // key 값으로 value를 검색
	abstract void put(String key, String value); // key와 value를 쌍으로 저장
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께)을 삭제. 삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap {
	protected int count = 0; // 현재 저장된 아이템의 개수
	
	public Dictionary(int capacity) { // 생성자
		keyArray = new String [capacity];
		valueArray = new String [capacity];
	}
	
	@Override
	String get(String key) {
		for(int i=0; i<keyArray.length;i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
			break;
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for(int i=0; i<keyArray.length;i++) {
			if(keyArray[i]==null) {
				keyArray[i]=key;
				valueArray[i]=value;
				break;
			}
			else if (keyArray[i].equals(key)) {
				valueArray[i]=value;
				break;
			}
		}
	}

	@Override
	String delete(String key) {
		boolean is = false;
		int i;
		for(i=0; i < length(); i++)
		{
			if(keyArray[i].equals(key))
			{
				is = true;
				break;
			}

		}
		if(is) //키 존재, 다 땡기고, value 리턴
		{
			for(int j=i; j<count-1; j++)
			{
				keyArray[j] = keyArray[j+1];
				valueArray[j] = valueArray[j+1];
			}
			return valueArray[i];
		}
		else //존재안함.
			return null;
	}

	
	@Override
	int length() { return count; }

}
public class Test3 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");		
		System.out.println("황기태의 값은 " + dic.get("황기태"));	
	}
}
