package Observer.NewsAgencyExample;

public class AssertUtils {

    public static void assertEquals(Object expected, Object actual) {
    	
    	System.out.println("Actual: "+ actual);
    	System.out.println("Expected: "+ expected);
    	
        if (expected == null && actual == null) {
            return; // both are null, considered equal
        }
        if (expected != null && expected.equals(actual)) {
            return; // equal
        }
        // If not equal, throw an AssertionError
        throw new AssertionError("Assertion failed: expected [" + expected + "] but found [" + actual + "]");
    }
}
