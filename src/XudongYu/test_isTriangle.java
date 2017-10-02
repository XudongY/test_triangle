package XudongYu;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class test_isTriangle {
    @Test
    public void  isTriangle () {
        Triangile first = new Triangile(1,2,2);
        int res1 = first.getAge1() + first.getAge2() - first.getAge3();
        int res2 = first.getAge2() + first.getAge3() - first.getAge1();
        int res3 = first.getAge3() + first.getAge1() - first.getAge2();
        assertTrue("It is a triangle",res1 > 0 && res2 > 0 && res3 > 0);
    }
}

