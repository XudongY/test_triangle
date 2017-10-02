package XudongYu;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class test_isIsosceles {
    @Test
    public void isIsosceles () {
        Triangile triangile = new Triangile(1,2,2);
        assertTrue("It is a Isosceles triangle",
                triangile.getAge1() == triangile.getAge2() ||
                        triangile.getAge2() == triangile.getAge3() ||
                        triangile.getAge3() == triangile.getAge1());
    }
}
