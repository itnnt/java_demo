package example_enum;

public class Fabric {
	public enum Color {
		
		// This will invoke the constructor with an integer argument
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;

		// constructor for the Color(int). The constructor must be default or private
		private Color(int rgb) {
			this.rgb = rgb;
		}

		// getter
		int getRgb() {
			return this.rgb;
		}
	};
	
	// user enum Color
	public static void main(String[] arg) {
		Color c= Color.GREEN;
		System.out.println(c.getRgb());
		 if( Color.RED.ordinal() < Color.BLUE.ordinal() ) {
			 System.out.println("Color.RED < Color.BLUE");
		 }
	}
}
