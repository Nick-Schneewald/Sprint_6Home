import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatsTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundNoParamsReturnsMeowing() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getSoundNoParamsDoesNotReturnsNull() {
        Cat cat = new Cat(feline);
        Assert.assertNotEquals(null, cat.getSound());
    }

    @Test
    public void getFoodNoParamsPredatorFoodList() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
