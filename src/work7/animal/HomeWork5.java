package work7.animal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多型簡化本題的程式設計)

public class HomeWork5 {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		String filePath = "C:/data/Object.ser"; // 檔案路徑

		// 反序列化(讀取物件)
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				try {

					Object obj = ois.readObject(); // 讀取物件

//					if (obj instanceof Dog) {
//						((Dog) obj).speak();
//					} else if (obj instanceof Cat) {
//						((Cat) obj).speak();
//					}
			if (obj instanceof Dog dog) { //新語法:如果 obj 是 Dog，則直接轉型為dog
			    dog.speak();
			} else if (obj instanceof Cat cat) {
			    cat.speak();
			}
				} catch (EOFException e) {
					System.out.println("資料讀取OK!");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("檔案讀取失敗!" + e);
		}
	}
}
