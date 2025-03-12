package work4;

import java.util.Scanner;

// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
// (提示1：Scanner，陣列)
// (提示2：需將閏年條件加入)
// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
public class WhichDayOfYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入西元");
		int year = sc.nextInt();
		System.out.println("請輸入月份");
		int month = sc.nextInt();
		System.out.println("請輸入日期");
		int day = sc.nextInt();

		// 計算第幾天
		int result = whichDay(year, month, day);
		if (result > 0) {
			System.out.println("輸入日期為該年第  " + result + "  天");
		} else {
			System.out.println("輸入日期不正確！");
		}
		sc.close();
	}

	static int whichDay(int year, int month, int day) {

		// 定義每月天數
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 判斷閏年:能被4整除且不能被100整除,能被100整除但不能被400整除的年份,能被 400 整除
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		} else {
			daysInMonth[1] = 28;
		}

		// 檢查輸入的月份與日期是否有效
		if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
			return -1; // 返回 -1 表示輸入無效
		}
		// 計算該日期是第幾天,計算輸入month之前的月份總天數
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}
		// 累計天數:月份天數+天數
		dayOfYear += day;
		return dayOfYear;
	}
}