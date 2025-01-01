package work4;

//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH (提示：String方法，陣列
public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello World";
		
		// 字串轉字元陣列(利用系統API裡String類中的一個方法toCharArray())
		char[] charArr = s.toCharArray();
		
		// 宣告字串並初始化，用於儲存反轉後的結果
		String reversed = "";  
		
		//charArr.length -1取最後一個索引值位置
		for(int i = charArr.length -1; i >= 0; i--) {
			reversed +=  charArr[i];
		}
		System.out.println(reversed);
	}

	
	
		//Part2
	   // 效率更高作法使用 StringBuilder 儲存反轉後的結果
//    StringBuilder reversed = new StringBuilder();
//    
//    for (int i = charArr.length - 1; i >= 0; i--) {
//        reversed.append(charArr[i]);  // 使用 StringBuilder 進行字元拼接
//    }
//    
//    System.out.println(reversed.toString());  // 使用 toString() 來獲取最終的字串
//}
	
}
