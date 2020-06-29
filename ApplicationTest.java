import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void iterativeFactorial(){
        Assert.assertEquals(1, Application.iterativeFactorial(1));
        Assert.assertEquals(1, Application.iterativeFactorial(0));
        Assert.assertEquals(24, Application.iterativeFactorial(4));
        Assert.assertEquals(120, Application.iterativeFactorial(5));
    } /* end iterativeFactorial */

    @Test(expected = IllegalArgumentException.class)
    public void iterativeFactorialException(){
        Assert.assertEquals(-1, Application.iterativeFactorial(-1));
    } /* end iterativeFactorialException */
} /* end ApplicationTest */
