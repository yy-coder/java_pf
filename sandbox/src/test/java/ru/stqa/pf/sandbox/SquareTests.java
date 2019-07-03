package ru.stqa.pf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqu.pf.sandbox.Square;

@Test
public class SquareTests {
    public void testArea () {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }
}
