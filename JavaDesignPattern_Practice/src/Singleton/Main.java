package Singleton;

/***
Explanation:

We use the getInstance() method to instantiate the singleton class 
and then when we again call with new key word it return the same instance 
which is created only once.

The single_instance is static. So it shared the shared the shared among 
all it’s instances. That is why the object x, y and z having the same object.
Then we print the hashcode of all the object which is same which means 
they are sharing the same referrence and pointing 
to the same object.

***/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiating Singleton class with variable x
		Singleton x = Singleton.getInstance();
		
		// Instantiating Singleton class with variable y
		Singleton y = Singleton.getInstance();
		
		// Instantiating Singleton class with variable z
		Singleton z = Singleton.getInstance();
	
		// Printing the hash code for above variable as
        // declared
		System.out.println("Hashcode of x is " + x.hashCode());
		
		System.out.println("Hashcode of y is " + y.hashCode());
		
		System.out.println("Hashcode of z is " + y.hashCode());
		
		//Condition Check
		if(x ==y && y == z) {
			System.out.println(
					"Three objects point to the same memory location on the heap"
					);
		}
		
		// Now changing variable of instance x via toUpperCase method
		x.s = (x.s).toUpperCase();
		System.out.println("String from x: " +x.s + ", y: " + y.s);
		
		// Now again changing variable of instance y
		y.s = (y.s).toLowerCase();
		System.out.println("String from x: " +x.s + ", y: " + y.s);
		
		
				

	}

}
