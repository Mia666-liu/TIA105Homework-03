package work6;

//自訂例外類別，用來處理Calculator內的例外狀況
public class CalException extends Exception{
	public CalException(String msg) {
		super(msg);
	}
}
