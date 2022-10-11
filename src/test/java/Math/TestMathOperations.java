package Math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperations {

    @Test
    public void checkSumm(){
        Assert.assertTrue(summ(4,5) == 9);
        Assert.assertTrue(summ(2,6) == 8);
        Assert.assertTrue(summ(34,6) == 40);
    }

    public int summ(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }
}