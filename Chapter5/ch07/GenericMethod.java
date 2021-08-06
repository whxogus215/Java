package ch07;

public class GenericMethod {
	
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		
		double left = ((Number)p1.getX()).doubleValue(); // double �ڷ����� ����� ��.
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = Math.abs(right - left);
		double height = Math.abs(bottom - top);
		
		return width * height;
	}

	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(12, 20.0);
		Point<Integer, Double> p2 = new Point<>(10, 40.0);
		
		double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2); // ���׸� Ŭ������ �ƴϾ ���ο��� ��밡��
		System.out.println(size);
	
		
	}

}
