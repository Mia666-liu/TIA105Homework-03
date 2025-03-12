package work5;

//  請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		// 不斷要求輸入直到正確的寬和高
		while (true) {
			System.out.println("請輸入寬度與高度 :");
			width = sc.nextInt();
			height = sc.nextInt();
			if (width <= 0 || height <= 0) {
				System.out.println("請輸入正整數:");
				continue;
			}
			// 輸入正確跳出迴圈
			break;
		}
		starSquare(width, height);
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
