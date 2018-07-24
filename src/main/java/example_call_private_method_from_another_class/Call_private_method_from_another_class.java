package example_call_private_method_from_another_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * You can call the private method from outside the class by changing the runtime behaviour of the class.
 * By the help of java.lang.Class class and java.lang.reflect.Method class, we can call private method from any other class.
 * @author gvl00097
 *
 */
public class Call_private_method_from_another_class {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			Class c = Class.forName("call_private_method_from_another_class.A");
			Object newInstance = c.newInstance();
			Method method1 = c.getDeclaredMethod("printMessage", null);
			method1.setAccessible(true);
			method1.invoke(newInstance, null);
			
			Method method2 = c.getDeclaredMethod("printMessage", new Class[]{String.class});
			method2.setAccessible(true);
			method2.invoke(newInstance, "this is printed message");
			
			Method method3 = c.getDeclaredMethod("printMessage", new Class[]{String.class, int.class});
			method3.setAccessible(true);
			method3.invoke(newInstance, "this is printed message", 1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
