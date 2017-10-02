package XudongYu;
import org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
public class TriangleTest extends TestCase {
    protected  Triangile triangile;
    @Override
    protected void setUp(){
        triangile = new Triangile(3, 3, 3);
    }

    public void testIsEquilateral() {
        assertTrue("It is a equilateral triangle",
                triangile.getAge1() == triangile.getAge2() &&
                        triangile.getAge2() == triangile.getAge3());
    }


    public void testIsTriangle() {
        int res1 = triangile.getAge1() + triangile.getAge2() - triangile.getAge3();
        int res2 = triangile.getAge2() + triangile.getAge3() - triangile.getAge1();
        int res3 = triangile.getAge3() + triangile.getAge1() - triangile.getAge2();
        assertTrue("It is a triangle", res1 > 0 && res2 > 0 && res3 > 0);
    }


    public void testIsIsosceles() {
        assertTrue("It is a Isosceles triangle",
                triangile.getAge1() == triangile.getAge2() ||
                        triangile.getAge2() == triangile.getAge3() ||
                        triangile.getAge3() == triangile.getAge1());
    }


    public void testIsSclene() {
        assertTrue("It is a isSclene triangle",
                triangile.getAge1() != triangile.getAge2() &&
                        triangile.getAge2() != triangile.getAge3() &&
                        triangile.getAge3() != triangile.getAge1());
    }

}