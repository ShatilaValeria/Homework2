import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;

public class DataInputTest {
    static DataInput input = new Input();

    public static List<Object[]> parametersForEnteringNumber() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{"111", 111});
        result.add(new Object[]{"-222", -222});
        result.add(new Object[]{"+333", 333});
        result.add(new Object[]{"123.7", 123.7});
        result.add(new Object[]{"-678.90", -678.90});
        result.add(new Object[]{"+678.90", +678.90});
        result.add(new Object[]{"0", 0});
        result.add(new Object[]{"0.0", 0});
        result.add(new Object[]{"-0", -0.0});
        result.add(new Object[]{"+0", 0});
        return result;
    }


    public static List<Object[]> parametersForIncorrectEntering() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{"adc"});
        result.add(new Object[]{"123abc"});
        result.add(new Object[]{"abc123"});
        result.add(new Object[]{"123,12"});
        result.add(new Object[]{"123,aaa"});
        result.add(new Object[]{"-1233,121"});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForIncorrectEntering")
    public void testIncorrectInputNumber(String expected) {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            input.inputNumber(expected);
        });
    }

    @ParameterizedTest
    @MethodSource("parametersForEnteringNumber")
    public void testInputNumber(String expected, double paramNumber) {
        Assertions.assertEquals(input.inputNumber(expected), paramNumber);
    }

    public static List<Object[]> parametersForEnteringOperation() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{"1", 1});
        result.add(new Object[]{"2", 2});
        result.add(new Object[]{"3", 3});
        result.add(new Object[]{"4", 4});
        result.add(new Object[]{"5", 5});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForEnteringOperation")
    public void testInputOperation(String expected, double paramNumber) {
        Assertions.assertEquals(input.inputOperation(expected), paramNumber);
    }

    @ParameterizedTest
    @MethodSource("parametersForIncorrectEntering")
    public void testIncorrectInputOperation(String expected) {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            input.inputOperation(expected);
        });
    }
}
