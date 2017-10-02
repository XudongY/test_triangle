package XudongYu;
import junit.framework.Test;


import static org.junit.Assert.assertTrue;

public class test_isEquilateral {

    public void isEquilateral() {
        Triangile triangile = new Triangile(1, 2, 3);
        assertTrue("It is a equilateral triangle",
                triangile.getAge1() == triangile.getAge2() &&
                        triangile.getAge2() == triangile.getAge3());
    }
}
