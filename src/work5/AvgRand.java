package work5;

//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
//本次亂數結果:
//32 35 15 12 81 28 20 45 40 21
//32

public class AvgRand {

	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("本次亂數結果:");
		for(int k =0; k < 10; k++) {
			int i = (int)(Math.random() * 101);
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n" + "亂數總和平均值:" + sum / 10);
	}
}
