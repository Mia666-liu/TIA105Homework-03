package work1;

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
// 5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因


public class Explanation {
	public static void main(String[] args) {
		System.out.println(5 + 5);		// 兩者之和
		System.out.println(5 + '5');	// '5'對應Unicode編碼其十六進位值0035,換成十進位53
		System.out.println(5 + "5");	// 字串相接
	}
}
