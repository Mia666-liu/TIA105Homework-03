package work1;

//請設計一隻Java程式，計算12，6這兩個數值的和與積


public class Calculator {
	public static int add(int a, int b) {
	    return a + b;
	}

	public static int multiply(int a, int b) {
	    return a * b;
	}
	public static void main(String[] args) {
		int a = 12,b = 6;
//		int add = a + b,  multiply = a * b;
//		System.out.println("和:"+add);
//		System.out.println("積:"+multiply);
//		System.out.println("和:"+(a + b));
//		System.out.println("積:"+(a * b));
		System.out.println("和: " + add(a, b));  
        System.out.println("積: " + multiply(a, b));
		
	}
}


