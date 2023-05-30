import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelinesTest {

    @Test
    public void eatMeatNoParamsReturnsPredatorFoodList() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyNoParamsReturnsFelidae() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParamsReturnsValue() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
}
