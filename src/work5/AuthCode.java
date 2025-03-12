package work5;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合
public class AuthCode {

	public static void main(String[] args) {
		AuthCode getAu = new AuthCode();
//		System.out.println("本次隨機產生驗證碼為:\n" + getAu.genAuthCode());
		System.out.println("本次隨機產生驗證碼為:\n" + genAuthCode());
	}

//	public String genAuthCode() {
//		// 儲存數字0-9和大小寫字母
//		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String ran = "";
//		for (int i = 0; i < 8; i++) {
//			ran += str.charAt((int) (Math.random() * str.length()));
//		}
//		return ran;
//	}
//}
	
	//更有效率作法
	public static String genAuthCode() {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder ran = new StringBuilder(); //StringBuilder不會創新物件

        for(int i = 0; i < 8; i++) {
            ran.append(str.charAt((int) (Math.random() * str.length())));
        }

        return ran.toString(); //回傳字串
    }
}