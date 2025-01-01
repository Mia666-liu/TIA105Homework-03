package work3;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數
import java.util.Scanner;

public class BadWen {
	public static void main(String[] args) {
		// 創建Scanner物件來讀取用戶輸入
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number(1~9) you don't want :");
			int num = sc.nextInt();
			// 檢查輸入範圍是否正確
			if (num < 1 || num > 9) {
				System.out.println("1 to 9 OK??");
				continue;
			}
			// 呼叫checkNumbers方法並顯示結果
			checkNumbers(num);
			break;
		}
		sc.close();
	}
	static void checkNumbers(int num) {
		int count = 0;

		for (int i = 1; i <= 49; i++) {

			// 過濾不喜歡的數字
			if ((i % 10) != num && (i / 10) != num) {
				System.out.print(i + "\t");
				count++;

				// 每7個數字換行
				if (count % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\nThe available numbers are: " + count);
	}
}