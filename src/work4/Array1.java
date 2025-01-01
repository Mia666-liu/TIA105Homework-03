package work4;

import java.util.Arrays;

//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素(提示：陣列，length屬性)
public class Array1 {
	public static void main(String[] args) {
		// 建立陣列
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		// 平均值
		double avg = sum / arr.length;
		System.out.println("Averavg value :" + avg);

		// 大於平均值的元素
		System.out.println("Greater than the average :");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
