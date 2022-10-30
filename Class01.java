class Caaa {
	public int num1;
	public int num2;
}

class Cbbb extends Caaa {
	public void set_num(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public void show() {
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class Main {
	public static void main(String args[]) {
		Cbbb bb = new Cbbb();
		bb.set_num(5, 10);
		bb.show();
	}
}
