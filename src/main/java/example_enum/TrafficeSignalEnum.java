package example_enum;

public class TrafficeSignalEnum {
	enum TrafficSignal {
		// This will invoke the enum constructor with a String argument
		RED("stope"),
		GREEN("go"),
		YELLOW("slow down");
		
		private String action;
		public String getAction() {
			return this.action;
		}
		// Constructor must be default or private
		private TrafficSignal (String action) {
			this.action = action;
		}
		
	};
	
	public static void main(String[] arg) {
		for (TrafficSignal trf: TrafficSignal.values()) {
			System.out.println(trf + " - " + trf.getAction());
		}
	}
}


