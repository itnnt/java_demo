package example_enum;

class Building {int a;}

public class Barn extends Building {
	public static void main(String[] args) {
		Building build1 = new Building();
		Barn barn1 = new Barn();
		Barn barn2 = (Barn)build1;
		
	}
}
