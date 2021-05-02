class Dictionary extends PairMap {
	protected int count = 0; // 현재 저장된 아이템의 개수
	
	public Dictionary(int capacity) { // 생성자
		keyArray = new String [capacity];
		valueArray = new String [capacity];
	}
	
	@Override
	String get(String key) {

	}

	@Override
	void put(String key, String value) {

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

public class Test{
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