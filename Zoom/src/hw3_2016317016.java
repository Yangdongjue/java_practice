import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class hw3_2016317016{
	//�޴� ���� ó��
	static void input(HashMap<String, String> hs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-�̸� �Է�:"); String key=scanner.nextLine();
		System.out.print("-��ȭ��ȣ �Է�:"); String value=scanner.nextLine();
		hs.put(key, value);
	}
	static void delete(HashMap<String, String> hs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-������ �̸� �Է�:"); String key=scanner.nextLine();
		hs.remove(key);
	}
	static void modify(HashMap<String, String> hs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-������ �̸� �Է�:"); String key=scanner.nextLine();
		System.out.print("-��ȭ��ȣ �Է�:"); String value=scanner.nextLine();
		hs.replace(key, value);
	}
	static void search(HashMap<String, String> hs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-�˻��� �̸� �Է�:"); String key=scanner.nextLine();
		System.out.println(hs.get(key));		
	}
	//txt�а� �ؽ������� �����
	static void fileRead(HashMap<String, String>hs, File file){
		FileReader reader = null;
		BufferedReader bufferInput=null;
		try {
			reader=new FileReader(file);
			bufferInput= new BufferedReader(reader);
			String s;
			while((s= bufferInput.readLine())!=null) {//���� ��������
				System.out.println(s);
				String[] p = s.split("\t");	//���� ������ �Ǳ������� �и�
				if(hs.containsKey(p[0])==false) {//�ؽ��ʿ� �������� �ʴ� Ű�� ���			
					hs.put(p[0], p[1]);//�ؽ��ʿ� �߰�
				}
			}
		}
		catch (IOException e){
			
		}
	}
	//�ؽ����� txt�� ����
	static void fileWrite(HashMap<String, String>hs,File file) {
		FileWriter writer =null;
		try {
				writer=new FileWriter(file);
				ArrayList<String> keyList = new ArrayList<>(hs.keySet());	//�ؽ����� Ű���� ArrayListȭ
				Collections.sort(keyList);//����
				for(String key : keyList) {				
					String value  =hs.get(key);
					writer.write(key+'\t'+value+'\n');	//���ĵ� Ű�� �������� ����� ���� �ۼ�
				writer.flush(); //�ؽ�Ʈ�� �ۼ�
			}
		}
		catch (IOException e) {
			System.out.println("����¿���");
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		File file = new File("phoneNum.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("<<��ȭ��ȣ ���� ���α׷� ���� >>");
		int input=-1;
		while(input!=5) {
			System.out.print("\n[�̸�]\t[��ȭ��ȣ]\n");
			fileRead(hash,file); //txt�� ����ϰ� �ؽ������� �о����
			
			System.out.print("\n1.�߰� 2.����  3.���� 4.�˻� 5.����:");
			input=scanner.nextInt();
			if (input==1) 
				input(hash);
			else if(input==2)
				delete(hash);
			else if(input==3)
				modify(hash);
			else if(input==4)
				search(hash);
			else
				continue;
			fileWrite(hash,file); //�۾��� ���� �ؽ����� �����ϰ� �ؽ�Ʈȭ
		}
		scanner.close();
		System.out.println("���α׷� ����...");
		
	}
}