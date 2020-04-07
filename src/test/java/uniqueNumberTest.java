import org.junit.Assert;
import org.junit.Test;

public class uniqueNumberTest {
uniqueNumbers un = new uniqueNumbers();
    @Test
   public void maxUniqueNum() {
        Assert.assertEquals(1,uniqueNumbers.maxUniqueNum(new int[]{2, 2, 2, 2, 2, 2, 2, 2}, 8, 4 ));
        Assert.assertEquals(2,uniqueNumbers.maxUniqueNum(new int[]{7,5,5,7,5,5,7,5,5,6}, 10, 3 ));
    }


}
