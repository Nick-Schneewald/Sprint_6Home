import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionsTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensNoParamsReturnsOne() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeMaleLionReturnsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleLionReturnsFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodNoParamsReturnsPredatorFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}



