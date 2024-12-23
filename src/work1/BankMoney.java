package work1;
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google
//A=P(1+(r/n))^nt : A=本息和、P=初始本金、r=年利率、n=每年複利的次數、t=存款年數
public class BankMoney {
	public static void main(String[] args) {
		double p = 150_000_0, r = 0.02;
		int n = 1, t = 10;
		double totalmoney = p * Math.pow(1 + r/n, n * t);
		System.out.printf("本息和 = %.3f元%n" , totalmoney);
	}
}
