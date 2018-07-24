package example_enum;

public class EnumDemoColor {
	private enum Color {
		RED, 
		GREEN,
		BLUE
	};
	
	private Color color;
	
	public Color getColor() {
		return this.color;
	}
	
	public EnumDemoColor(Color color) {
		this.color = color;
	}
	
	// how to use EnumDemoColor
	public static void main(String[] arg) {
		EnumDemoColor enumDemoColor = new EnumDemoColor(Color.BLUE);
		
		switch (enumDemoColor.getColor()) {
			case RED:
				System.out.println("it is RED");
				break;
			case GREEN:
				System.out.println("it is GREEN");
				break;
			case BLUE:
				System.out.println("it is BLUE");
				break;
			default:
				System.out.println("It is no color");
				break;
		}
	}
}
