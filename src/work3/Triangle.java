package work3;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果
import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形三邊長:");
		int[] num = new int[3]; 
		for (int i = 0; i < 3 ; i++) {
			num[i] = sc.nextInt();
		}
		int x = num[0];
		int y = num[1];
		int z = num[2];
		if(x <= 0|| y <= 0 || z <= 0) {
			System.out.println("不是三角形");
		}else if(x == y && y == z) {
			System.out.println("正三角形");
		}else if(x == y || y == z || x == z ) {
			System.out.println("等腰三角形");	
		}else{
			System.out.println("其他三角形");
		}
	}
}
