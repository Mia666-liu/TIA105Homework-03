package work4;

import java.util.Scanner;

public class BadWen2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an amount of money :");
		int money = sc.nextInt();
		
		//檢查金額是否有效輸入
		if (money <= 0) {
			System.out.println("Are you serious?\nPlease enter an amount greater than 0 :");
		} else {
			borrowMoney(money);
		}
		sc.close();
	}

	static void borrowMoney(int money) {
		int[][] idWithMoney = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, 
				{ 19, 1000 }, { 27, 1200 } };

		int count = 0;
		int[] id = new int[idWithMoney.length];
		//檢查員工能否借錢
		for (int i = 0; i < idWithMoney.length; i++) {
			if (idWithMoney[i][1] >= money) {
				//將符合條件的員工編號存入陣列，並用 count記錄儲存位置
				id[count] = idWithMoney[i][0];
				
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Who can lend you money: ");
			for(int i = 0; i <count; i++) {
				System.out.print(id[i] + " ");
			}
			System.out.println("\nThe total who can lend you money:"+ count );
		} else {
			System.out.println("That's too much, sorry!");
		}
	}
}
