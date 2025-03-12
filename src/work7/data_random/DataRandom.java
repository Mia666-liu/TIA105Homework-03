package work7.data_random;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)

public class DataRandom {

	public static void main(String[] args) throws IOException {
		String file = "C:/TIA105_Workspace/TIA105Homework-03/src/work7/data_random/Data.txt";
		// try-with-resources自動關閉資源
		try (PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(file, true)))) {

			for (int i = 0; i < 10; i++) {
				int num = (int) (Math.random() * 1000) + 1;
				System.out.println(num);
				ps.println(num); // 寫入檔案
			}
			ps.println("------------");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
