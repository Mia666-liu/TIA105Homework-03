package work5;

// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳

public class OverloadingTest {

	public static void main(String[] args) {	
		int[][] intArray = {{1, 6, 3},{9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
		
		OverloadingTest a = new OverloadingTest();
		System.out.println(a.maxElement(intArray));
		System.out.println(a.maxElement(doubleArray));
	}

	public int maxElement(int[][] x) {
		int maxVal = 0;
		for (int i = 0; i < x.length; i++) {
			for (int k = 0; k < x[i].length; k++) {
				if (x[i][k] >= maxVal) {
					maxVal = x[i][k];
				}
			}
		}
		return maxVal;
	}

	public double maxElement(double[][] x) {
		double maxVal = 0;
		for (int i = 0; i < x.length; i++) {
			for (int k = 0; k < x[i].length; k++) {
				if (x[i][k] >= maxVal) {
					maxVal = x[i][k];
				}
			}
		}
		return maxVal;
	}
}
