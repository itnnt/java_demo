package java_design_pattern.singleton;

public class SingletonExample {
	/**
	 *  static member holds only one instance of the class 
	 */
	private static SingletonExample instance;

	public String st;

	/**
	 *  private constructor 
	 */
	private SingletonExample() {
		st = "Hello I am string part of the Singleton class";
	}

	/** 
	 * global access point 
	 */
	public static SingletonExample getInstance() {
		// lazy initialization
		if (null == instance) {
			instance = new SingletonExample();
		}
		return instance;
	}

	/**
	 * Demo using singleton
	 */
	public static void main(String[] args) {
		SingletonExample singletonInstance1 = SingletonExample.getInstance();
		SingletonExample singletonInstance2 = SingletonExample.getInstance();
		SingletonExample singletonInstance3 = SingletonExample.getInstance();

		System.out.println(singletonInstance1.st);
		System.out.println(singletonInstance2.st);
		System.out.println(singletonInstance3.st);

		singletonInstance1.st = "Hi I am new string for the singleton class";

		System.out.println(singletonInstance1.st);
		System.out.println(singletonInstance2.st);
		System.out.println(singletonInstance3.st);

	}
}
