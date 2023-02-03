import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class CalculatorOperationsTest {
    static CalculatorOperations calculator = new Calculator();

    public static List<Object[]> parametersForSum() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{1, 1, 2});
        result.add(new Object[]{22, -5, 17});
        result.add(new Object[]{-22, -1, -23});
        result.add(new Object[]{-1, -1, -2});
        result.add(new Object[]{1.88, 1.12, 3.0});
        result.add(new Object[]{-2.1, -2.1, -4.2});
        result.add(new Object[]{-2.1, 2.1, 0});
        result.add(new Object[]{022.0, -22.0, 0});
        result.add(new Object[]{+0, 2.1, 2.1});
        result.add(new Object[]{-2.1, 0, -2.1});
        result.add(new Object[]{0, 0, 0});
        result.add(new Object[]{+0, 0, 0});
        result.add(new Object[]{-0, -0, 0});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForSum")
    public void testSumNumber(double numberFirst, double numberSecond, double paramNumber) {
        Assertions.assertEquals(calculator.sumNumber(numberFirst, numberSecond), paramNumber);
    }

    public static List<Object[]> parametersForDifference() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{1, 1, 0});
        result.add(new Object[]{22, -5, 27});
        result.add(new Object[]{-22, -1, -21});
        result.add(new Object[]{-1, -1, 0});
        result.add(new Object[]{1.50, 1.75, -0.25});
        result.add(new Object[]{-2.1, -3.1, 1});
        result.add(new Object[]{-2.1, 2.1, -4.2});
        result.add(new Object[]{022.0, -22.0, 44});
        result.add(new Object[]{+0, 2.1, -2.1});
        result.add(new Object[]{-2.1, 0, -2.1});
        result.add(new Object[]{0, 0, 0});
        result.add(new Object[]{+0, 0, 0});
        result.add(new Object[]{-0, -0, 0});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForDifference")
    public void testDifference(double numberFirst, double numberSecond, double paramNumber) {
        Assertions.assertEquals(calculator.differenceNumber(numberFirst, numberSecond), paramNumber);
    }

    public static List<Object[]> parametersForMultiplication() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{1, 1, 1});
        result.add(new Object[]{22, -5, -110});
        result.add(new Object[]{-22, -1, 22});
        result.add(new Object[]{-1, -1, 1});
        result.add(new Object[]{1.50, 2.5, 3.75});
        result.add(new Object[]{-2.5, -3.5, 8.75});
        result.add(new Object[]{-2.5, 2.5, -6.25});
        result.add(new Object[]{2.0, -2, -4});
        result.add(new Object[]{+0, 2.1, 0});
        result.add(new Object[]{2.1, 0, 0});
        result.add(new Object[]{0, 0, 0});
        result.add(new Object[]{+0, 0, 0});
        result.add(new Object[]{-0, -0, 0});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForMultiplication")
    public void testMultiplication(double numberFirst, double numberSecond, double paramNumber) {
        Assertions.assertEquals(calculator.multiplicationNumber(numberFirst, numberSecond), paramNumber);
    }

    public static List<Object[]> parametersForDivision() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{1, 1, 1});
        result.add(new Object[]{22, -11, -2});
        result.add(new Object[]{-22, -1, 22});
        result.add(new Object[]{-1, -1, 1});
        result.add(new Object[]{2.50, 2.5, 1});
        result.add(new Object[]{-2.5, -2.5, 1});
        result.add(new Object[]{-2.5, 2.5, -1});
        result.add(new Object[]{2.0, -2, -1});
        result.add(new Object[]{+0, 2.1, 0});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForDivision")
    public void testDivision(double numberFirst, double numberSecond, double paramNumber) {
        Assertions.assertEquals(calculator.divisionNumber(numberFirst, numberSecond), paramNumber);
    }

    public static List<Object[]> parametersForDivisionByZero() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{2.1, 0, 0});
        result.add(new Object[]{0, 0, 0});
        result.add(new Object[]{0, +0, 0});
        result.add(new Object[]{-0, -0, 0});
        return result;
    }

    @ParameterizedTest
    @MethodSource("parametersForDivisionByZero")
    public void testDivisionByZero(double numberFirst, double numberSecond) {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divisionNumber(numberFirst, numberSecond);
        });
    }
}