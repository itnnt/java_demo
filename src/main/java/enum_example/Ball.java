package enum_example;

public class Ball {
	public enum Color{RED, GREEN, BLUE};
	public void foo() {
		for (Color c: Color.values()) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] arg) {
		Ball b = new Ball();
		b.foo();
	}
}
