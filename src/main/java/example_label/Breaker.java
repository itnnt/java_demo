package example_label;

public class Breaker {
	static String o="";
	public static void main(String[] args) {
		o += 2;
		// create a label z
		z: for (int x=3; x<8; x++) {
			if (x==4)
				break; // break the for loop
			if (x==8)
				break z; // break the label z
			o += x;
		}
		System.out.print(o);
	}

}