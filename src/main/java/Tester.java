
public class Tester {
	static String o="";
	public static void main(String[] args) {
		Integer i=new Integer(1)+new Integer(2);
		switch(i) {
			case 3:
				System.out.print("three");
				break;
			default:
				System.out.print("other");
				break;
		}
	}

}
