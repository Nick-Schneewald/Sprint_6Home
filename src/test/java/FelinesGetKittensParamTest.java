import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FelinesGetKittensParamTest {

    @Parameterized.Parameter(0)
    public int kittensCount;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name = "{index}. Тест на возвращаемое кол-во котят. Входное значение: {0} Ожидаемое значение: {1}")
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                {3, 3},
                {0, 0},
                {1, 1},
                {-1,-1}
        });
    }

    @Test
    public void getKittensWithIntParameter() {
        Feline feline = new Feline();
        Assert.assertEquals(expectedResult, feline.getKittens(kittensCount));
    }
}
