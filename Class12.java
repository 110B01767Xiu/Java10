class CShape {
	public double area() {
		return 0.0;
	}
}
class CCircle extends CShape {
	double radius;
	public CCircle(double r) {
		radius = r;
	}
	public double area() {
		return (3.14 * radius * radius);
	}
}
class CSquare extends CShape {
	double side;
	public CSquare(double s) {
		side = s;
	}
	public double area() {
      return (side * side);
	}
}
class CTriangle extends CShape {
	double base, height;
	public CTriangle(double b, double h) {
		base = b;
		height = h;
	}
	public double area() {
		return (base * height / 2);
	}
}
public class Main {
	public static void main(String args[]) {
		CShape test[] = new CShape[6];
		test[0] = new CCircle(1.0);
		test[1] = new CCircle(10.0);
		test[2] = new CSquare(1.0);
		test[3] = new CSquare(2.0);
		test[4] = new CTriangle(3, 4);
		test[5] = new CTriangle(5, 12);
		for(int i = 0; i < test.length; i++)
			System.out.println("area of test[" + i + "]= " + test[i].area());
			System.out.println("largest area = " + largest(test));
		}
	public static double largest(CShape a[]) {
		double max = a[0].area();
		for(int i = 0; i < a.length; i++) {
			if(max < a[i].area())
				max = a[i].area();
		}
		return max;
	}
}
