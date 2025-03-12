package work5;

//透過getArea()印出結果
public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle rec = new MyRectangle();
		rec.setWidth(10);
		rec.setDepth(20);
		System.out.println(rec.getArea());
		
		MyRectangle rec2 = new MyRectangle(10, 20);
		System.out.println(rec2.getArea());
	}
}
