import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest {

    @Test
    public void testEqual(){
        Apple apple = new Apple("orange", "big");
        Assert.assertEquals("orange", apple.getName());
        Assert.assertEquals("big", apple.getSize());
    }

}