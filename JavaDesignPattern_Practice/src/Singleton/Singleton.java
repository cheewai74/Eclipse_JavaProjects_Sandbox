/**
 * 
 */
package Singleton;

/**
 * Helper class
 * 
 * Step 1: Create the private constructor of the singleton class to prevent direct instantiation.
 * Step 2: Create static method also called as getInstance() method to return the single instance of the class.
 * Step 3: Store the instance in the private static variable which make sure that the only single instance is created.
 */
public class Singleton {
	
	public String s;
	
	// Static variable reference of single_instance of type Singleton
	private static Singleton single_instance = null;
	

	/**
	 * Step 1: Create the private constructor of the singleton class
	 */
	private Singleton() {
		s = "Hello, I'm a string parth of singleton class";
	}
	
	/**
	 * 
	 * Step 2: Create static method also called as getInstance()
	 * @return: single_instance
	 * 
	 */
	public static synchronized Singleton getInstance() {
		if (single_instance == null) {
			
//			Step 3: Store the instance in the private static variable 
			single_instance = new Singleton();
		}
		return single_instance;
	}
	

}
