package work7.read_sample;
//請自行建立一個文字檔Sample.txt，內容如下：

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadSample {

	public static void main(String[] args) {
		String fileName = "C:/TIA105_Workspace/TIA105Homework-03/src/work7/read_sample/Sample.txt";
		int i;
		try {
			// 用java.io內建Class File來建立物件
			File file = new File(fileName);
			if (!file.exists()) {
				System.out.println("檔案不存在!請重新確認檔案資訊");
				return;
			}

			// ----方法1：使用FileReader逐字讀取----
//			FileReader fr1 = new FileReader(file);
//			while ((i = fr1.read()) != -1) {// read()一字一字讀入
//				System.out.print((char) i);
//			}
//			fr1.close();

//			// ----方法2：使用BufferedReader + read()逐字讀取----
//			FileReader fr2 = new FileReader(file);
//			BufferedReader br1 = new BufferedReader(fr2);
//			while ((i = br1.read()) != -1) {
//				System.out.print((char) i);
//			}
//			br1.close();
//			fr2.close();
//
//			// ----方法3：使用BufferedReader + readLine()逐行讀取----
			FileReader fr3 = new FileReader(file);
			BufferedReader br2 = new BufferedReader(fr3);
			String line;
			int charCount = 0;
			int lineCount = 0;
			long fileSize = file.length(); // 取得檔案大小（位元組）
			// readLine()整行文字一次讀入
			// 因回傳結果為字串，所以讀到沒資料回傳結果為空值(不為空來代表有沒有資料~)
			while ((line = br2.readLine()) != null) {
				System.out.println(line);
				lineCount++; // 計算行數
				charCount += line.length(); // 計算字元數(不含換行符號)
			}
			br2.close();
			fr3.close();

			System.out
					.println("\nSample.txt 檔案共有 : " + fileSize + " 個位元組，" + charCount + " 個字元，" + lineCount + " 列資料。");

		} catch (IOException e) {
			System.out.println("讀取檔案發生錯誤 :" + e.getMessage());
		}
	}
}