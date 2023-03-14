package ex;

public class Example3 {
	public static void main(String[] args) {

		for (int num = 2; num < 0; num++) {
			System.out.println(num + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + " = " + (num * i));
			}

		}

	}
}
