class Caaa {
	public int num1;
	public int num2;

	public Caaa() {
		num1 = 1;
		num2 = 1;
	}
	public Caaa(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbb extends Caaa {
	public Cbbb() {
	}
	public Cbbb(int a, int b) {
		super(a, b);
	}
	public void show() {
		System.out.println(num1 + " " + num2);
	}
}

public class Main {
	public static void main(String args[]) {
		Cbbb test1 = new Cbbb();
		Cbbb test2 = new Cbbb(0, 3);
		test1.show();
		test2.show();
	}
}
