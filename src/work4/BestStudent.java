package work4;
// 班上有8位同學，他們進行了6次考試結果如下：
// 請算出每位同學考最高分的次數(提示：二維陣列)
public class BestStudent {

	public static void main(String[] args) {
							
		int[][] scores = {	//學生 1   2   3    4    5   6   7   8
								{ 10, 35, 40, 100, 90, 85, 75, 70 }, // 第1次考試成績
								{ 37, 75, 77, 89, 64, 75, 70, 95 },  // 第2次考試成績
								{ 100, 70, 79, 90, 75, 70, 79, 90 }, // 第3次考試成績
								{ 77, 95, 70, 89, 60, 75, 85, 89 },  // 第4次考試成績
								{ 98, 70, 89, 90, 75, 90, 89, 90 },  // 第5次考試成績
								{ 90, 80, 100, 75, 50, 20, 99, 75 }  // 第6次考試成績
		};
		// 儲存每位同學獲得高分次數
		int[] maxScCount = new int[8];

		for (int i = 0; i < 6; i++) {
			
			int highSc = 0; // 該次考試最高分
			int student = 0; // 該次考試最高分同學索引
			for (int k = 0; k < 8; k++) { // 找出當次考試的最高分
				if (scores[i][k] > highSc) {
					highSc = scores[i][k];
					student = k;//記錄該次考試獲得最高分的同學索引。
				}
			}
//			int[] maxScCount = {0, 0, 0, 0, 0, 0, 0, 0};
//			int student = 3; // 表示第 4 號同學獲得最高分
//			maxScCount[3] = maxScCount[3] + 1;
//			maxScCount = {0, 0, 0, 1, 0, 0, 0, 0}; // 第 4 號同學的次數加 1
			// 更新同學高分次數
			maxScCount[student]++;
		}
		for (int i = 0; i < 8; i++) {
			System.out.println((i + 1) + "號同學拿了最高分次數 : " + maxScCount[i]);
		}
	}
}
