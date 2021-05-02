class Dictionary extends PairMap {
	protected int count = 0; // ���� ����� �������� ����
	
	public Dictionary(int capacity) { // ������
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
		if(is) //Ű ����, �� �����, value ����
		{
			for(int j=i; j<count-1; j++)
			{
				keyArray[j] = keyArray[j+1];
				valueArray[j] = valueArray[j+1];
			}
			return valueArray[i];
		}
		else //�������.
			return null;
	}

	
	@Override
	int length() { return count; }

}

public class Test{
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����		
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");		
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));	
	}

}