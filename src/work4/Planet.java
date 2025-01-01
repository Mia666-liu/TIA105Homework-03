package work4;

//有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示：字元比對，String方法)
public class Planet {

	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int sum = 0;
		for (int i = 0; i < planets.length; i++) {
			for (int k = 0; k < planets[i].length(); k++) { //迴圈字元數量
				if (planets[i].charAt(k) == 'a' || planets[i].charAt(k) == 'e' || planets[i].charAt(k) == 'i'
						|| planets[i].charAt(k) == 'o' || planets[i].charAt(k) == 'u') {
					sum++;
				}
			}
		}
		System.out.println("總共有" + sum + "個母音");
	}

}
