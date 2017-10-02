package XudongYu;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestCase testCase = new test_triangle() {
            public void runTest() {
                new test_isEquilateral();
            }
        };
        testCase.run();
    }
}
