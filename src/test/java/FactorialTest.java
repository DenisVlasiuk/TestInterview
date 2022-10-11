import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    // 5! = 5*4*3*2*1
    // 1! = 1
    // 0! = 1
@Test
    public void checkFactorial(){
        Assert.assertTrue(factorial(2)==2);
        Assert.assertTrue(factorial(3)==6);
        Assert.assertTrue(factorial(4)==24);
        Assert.assertTrue(factorial(1)==1);
        Assert.assertTrue(factorial(0)==1);

    }
    public int factorial(int n) {
        int result = 1;

        if (n == 1 || n == 0) {
            return result;
        }
           int[] array = new int[n];
        for (int i = n; i > 0; i--){
            array[i-1] = i;

        }
        for (int elementInArr : array){
            result = result*elementInArr;

        }
        return result;
    }
}
