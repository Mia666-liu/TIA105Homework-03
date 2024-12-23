package work1;
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)


public class Egg {
	public static void main(String[] args) {
		int egg = 200;
		System.out.println((egg/12)+"打 "+(egg%12)+"顆");
		
		
//		格式化並輸出
	    System.out.printf("%d打 %d顆\n", egg / 12, egg % 12);
	}
}
