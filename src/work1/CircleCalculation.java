package work1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//A=π×r^2 
//C=2×π×r

public class CircleCalculation {
	public static void main(String[] args) {
		final double PI = 3.14159;	
//		double pi = Math.PI;  //Java 中的 Math 類已經為 pi 的值建立了一個常量  
		int r = 5;
		System.out.printf("area = %.2f%n",Math.pow(r, 2)*PI);
		System.out.printf("circumference = %.2f", 2*PI*r);
	}
}
