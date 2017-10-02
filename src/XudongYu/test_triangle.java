package XudongYu;

import junit.framework.TestCase;
import junit.framework.Assert;
import org.junit.Test;

public class test_triangle extends TestCase {
    protected  Triangile triangile;
    protected double fvalue1;
    protected double fvalue2;
    @Override
    protected void setUp(){
        triangile = new Triangile(3, 3, 3);
        fvalue1 = 2.0;
        fvalue2 = 3.0;
    }

    public void isEquilateral() {
        double res = fvalue1 + fvalue2;
        assertTrue(res == 5.0);
        assertTrue("It is a equilateral triangle",
                triangile.getAge1() == triangile.getAge2() &&
                        triangile.getAge2() == triangile.getAge3());
    }


    public  void isTriangle() {
        Triangile first = new Triangile(1, 2, 2);
        int res1 = triangile.getAge1() + triangile.getAge2() - triangile.getAge3();
        int res2 = triangile.getAge2() + triangile.getAge3() - triangile.getAge1();
        int res3 = triangile.getAge3() + triangile.getAge1() - triangile.getAge2();
        assertTrue("It is a triangle", res1 > 0 && res2 > 0 && res3 > 0);
    }


    public void isIsosceles() {
        assertTrue("It is a Isosceles triangle",
                triangile.getAge1() == triangile.getAge2() ||
                        triangile.getAge2() == triangile.getAge3() ||
                        triangile.getAge3() == triangile.getAge1());
    }


    public void isSclene() {
        assertTrue("It is a isSclene triangle",
                triangile.getAge1() != triangile.getAge2() &&
                        triangile.getAge2() != triangile.getAge3() &&
                        triangile.getAge3() != triangile.getAge1());
    }


    TestCase test = new test_triangle();
}