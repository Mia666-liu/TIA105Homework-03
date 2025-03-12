package work6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		try {
			System.out.print("請輸入x值: ");
			int x = sc.nextInt();

			System.out.print("請輸入y值: ");
			int y = sc.nextInt();

			int result = cal.powerXY(x, y);
			System.out.println(x + "的" + y + "次方=" + result);
		} catch (CalException e) {
			System.out.println("格式輸入錯誤!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("發生未知錯誤:" + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
