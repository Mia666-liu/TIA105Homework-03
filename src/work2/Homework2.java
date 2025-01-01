package work2;

public class Homework2 {

	public static void main(String[] args) {
		System.out.println("1～1000的偶數和: " + getoneTo1000());  
		System.out.println("1～10的連乘積: " + multiply1());
		System.out.println("1～10的連乘積: " + multiply2());
		System.out.print("輸出結果: " ); multiply3();
		System.out.println("可選擇數字總數: "+ removeFour());
		oneTwoTen();
		aTof();
	}
	
//	• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
	public static int getoneTo1000() {
		int sum = 0;
		int a;
		for(a = 1; a <= 1000; a++) {
			if(a % 2 == 1) {
				continue;
			}
			sum += a;
		}
		return sum;
	}

//	• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
	public static int multiply1() {
		int sum = 1;
		int a;
		for (a = 1; a <= 10; a++) {			
			sum *= a; 
		}
		return sum;
	}
	
//	• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
	public static int multiply2() {
		int sum = 1;
		int a = 1;
		while(a <= 10) {
			sum *= a;
			a++;
		}
		return sum;
	}
	
//	• 請設計一隻Java程式，輸出結果為以下：
//	1 4 9 16 25 36 49 64 81 100
	public static void multiply3() {
		int a ;
		int b ;
		for(a = 1; a <= 10; a++ ) {
			b = a * a;
			System.out.print(b + " ");
		}
	}		
// 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
	public static int removeFour() {
	    int sum = 0;
	    System.out.print("\n阿文可以選擇的數字有：");
	    for (int i = 1; i <= 49; i++) {	        
	        if (i % 10 == 4 || i / 10 == 4) {
	            continue;
	        }	        
	        System.out.print(i + " ");  
	        sum++; 
	    }    
	    System.out.print("\n");  
	    return sum;  
	}
	
/*	請設計一隻Java程式，輸出結果為以下：
	 1 2 3 4 5 6 7 8 9 10
	 1 2 3 4 5 6 7 8 9
	 1 2 3 4 5 6 7 8
	 1 2 3 4 5 6 7
	 1 2 3 4 5 6 
 	 1 2 3 4 5
	 1 2 3 4 
	 1 2 3 
	 1 2 
	 1
*/	
	public static void oneTwoTen() {
		int i, j;
		System.out.println("1到10顯示如下:");
		for(i = 10; i <= 10; i--) {
			for(j = 1; j <= i; j++) {
			System.out.print( j + " ");	
			}
			System.out.println();
			if( i == 0) {
				break;
			}
		}
	}
	
	
	
/*
• 請設計一隻Java程式，輸出結果為以下：
 A
 BB
 CCC
 DDDD
 EEEEE
 FFFFFF	
 */
	public static void aTof() {
//		int i = 111;
//		System.out.println("A到F顯示如下:");
//		switch(i) {
//		case 111:
//			System.out.println("A");
//		case 222:
//			System.out.println("BB");
//		case 333:	
//			System.out.println("CCC");
//		case 444:
//			System.out.println("DDDD");
//		case 555:
//			System.out.println("EEEEE");
//		case 666:
//			System.out.println("FFFFFF");
//		}
		char eng ;
		int i, j;
		for(i = 0; i < 6; i++) {
			for(j = 0; j <= i; j++) {
				int sum = 'A' + i;
				 eng = (char)sum;
				System.out.print(eng);
			}
			System.out.print("\n");
		}
		
			
	}
}