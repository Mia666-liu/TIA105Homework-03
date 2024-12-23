package work3;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		int i = (int) (Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("guess:");
		while (true) {
			int num = sc.nextInt();
			if (num > i) {
				System.out.println("太大");
			} else if (num < i) {
				System.out.println("太小");
			} else {
				System.out.println("恭喜答對真棒!");
				break;
			}
		}
	}
}
