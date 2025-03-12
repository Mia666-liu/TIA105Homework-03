package work8;
//請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
import java.math.BigInteger; //存放大數字
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// 建立Collection物件
		Collection<Object> col = new ArrayList<>();
		// 編譯器自動裝拆箱
		col.add(100);
		col.add(3.14);
		col.add(21L);
		col.add(21L);
		col.add(Short.valueOf("100"));// 將字串100轉換成Short封裝型別
		col.add("Kitty");
		col.add(100);
		col.add(new Object()); // 建立Object()物件
		col.add("Snoopy");
		col.add(new BigInteger("1000"));

		System.out.println("----使用Iterator-------");
		Iterator<Object> iter = col.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("\n----使用傳統for-------");
		Object[] arr = col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n----使用foreach-------");
		for (Object obj : col) {
			System.out.println(obj);
		}

//			移除不是java.lang.Number相關的物件
		// removeIf根據條件移除元素
		// instanceof Number檢查obj是否為數字型別Integer、Double...
		col.removeIf(obj -> !(obj instanceof Number));

		System.out.println("\n----移除非數字物件----");
		for (Object obj : col) {
			System.out.println(obj);
		}
	}

}
