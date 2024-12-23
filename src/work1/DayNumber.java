package work1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class DayNumber {
	public static void main(String[] args) {
		int totalsec = 256559;
		int days = totalsec / 86400;
		totalsec = totalsec % 86400;

		int hours = totalsec / 3600;
		totalsec = totalsec % 3600;

		int minutes = totalsec / 60, seconds = totalsec % 60;

		System.out.print(days + "天 " + hours + "小時 " + minutes + "分 " + seconds + "秒");
	}
}
