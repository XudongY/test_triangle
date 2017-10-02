package XudongYu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_isScalene {
    @Test
    public void isSclene() {
        Triangile triangile = new Triangile(1, 2, 3);
        assertTrue("It is a isSclene triangle",
                triangile.getAge1() != triangile.getAge2() &&
                        triangile.getAge2() != triangile.getAge3() &&
                        triangile.getAge3() != triangile.getAge1());
    }
}
