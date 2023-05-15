import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionsHaveManeNegativeTest {
    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void shouldHaveManeNegativeTestUnknown() throws Exception {
        Lion lion = new Lion("Неизвестно", feline);
    }

    @Test(expected = Exception.class)
    public void shouldHaveManeNegativeTestUndefined() throws Exception {
        Lion lion = new Lion("Неопределено", feline);

    }
}
