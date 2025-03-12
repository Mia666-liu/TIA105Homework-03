package work7.animal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

public class Animal {
	public static void main(String[] args) {
		// 如果沒有implements Serializable會有例外發生，表示沒貼標籤，沒有實作Serializable
		// 實作Serializable就會有隱藏的serialVersionUID，當類別內容變動，UID也會跟著變動(對JAVA來說是不同版本)
		// 因此會出現InvalidClassException，為解決此問題則須將隱藏變數顯示出來
		String filePath = "C:/data";
		String fileName = "C:/data/Object.ser";

		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}

		// 建立物件
		Dog dog1 = new Dog("Tommy");
		Dog dog2 = new Dog("Tommy2");
		Cat cat1 = new Cat("Mia");
		Cat cat2 = new Cat("Mia2");
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(dog1);
			oos.writeObject(dog2);
			oos.writeObject(cat1);
			oos.writeObject(cat2);
			System.out.println("物件已成功寫入 :" + fileName);

		} catch (IOException e) {

			System.out.println("物件寫入失敗 :" + e);
		}
	}
}
