package zoom0518;

import java.io.File;

public class Buffer3 {
	public static void main(String[] args) {
		File file = new File("C:\\");
		File[] subFiles= file.listFiles();
		File big = subFiles[0];
		for (File i : subFiles) {
			if(big.length()<i.length()) {
				big=i;
			}
		}
		System.out.printf("가장 큰 파일의 이름은 %s이고 크기는 %d바이트입니다.",big.getName(), big.length());
	}
}
