package example_call_private_method_from_another_class;

public class A {
	private void printMessage() {
		System.out.println("This is a message from private method");
	}
	
	private void printMessage(String message) {
		System.out.println(message);
	}
	
	private void printMessage(String message, int idx) {
		System.out.println(message + idx);
	}
}
