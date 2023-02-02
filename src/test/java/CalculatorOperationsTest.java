import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class CalculatorOperationsTest {
    CalculatorOperations calculator = new Calculator();
    CalculatorMenu menu = new Menu();

    @Test
    public void sum_1_Plus_1_Expect_2() {
        Assert.assertEquals((calculator.sumNumber(1,1)),2.0, 0);
    }

    @Test
    public void sum_22_Plus_Minus5_Expect_17() {
        Assert.assertEquals((calculator.sumNumber(22,-5)),17.0, 0);
    }

    @Test
    public void sum_Minus425_Plus_25_Expect_Minus400() {
        Assert.assertEquals((calculator.sumNumber(-425,25)),-400.0, 0);
    }

    @Test
    public void sum_Minus100_Plus_Minus900_Expect_Minus1000() {
        Assert.assertEquals((calculator.sumNumber(-100,-900)),-1000.0, 0);
    }

    @Test
    public void difference_22_Minus_38_Expect_Minus16() {
        Assert.assertEquals((calculator.differenceNumber(22, 38)), -16, 0 );
    }

    @Test
    public void difference_Minus100_Minus_38_Expect_Minus138() {
        Assert.assertEquals((calculator.differenceNumber(-100, 38)), -138, 0 );
    }

    @Test
    public void difference_Minus100_Minus_Minus38_Expect_Minus62() {
        Assert.assertEquals((calculator.differenceNumber(-100, -38)), -62, 0 );
    }

    @Test
    public void difference_22_Minus_Minus900_Expect_922() {
        Assert.assertEquals((calculator.differenceNumber(22, -900)), 922, 0 );
    }

    @Test
    public void composition_22_Multiply_1_Expect_22() {
        Assert.assertEquals((calculator.compositionNumber(22, 1)), 22, 0 );
    }


    @Test
    public void composition_22_Multiply_0_Expect_0() {
        Assert.assertEquals((calculator.compositionNumber(22, 0)), 0, 0 );
    }

    @Test
    public void composition_0_Multiply_10_Expect_0() {
        Assert.assertEquals((calculator.compositionNumber(0, 10)), 0, 0 );
    }

    @Test
    public void composition_Minus20_Multiply_10_Expect_Minus200() {
        Assert.assertEquals((calculator.compositionNumber(-20, 10)), -200, 0 );
    }

    @Test
    public void composition_Minus20_Multiply_Minus10_Expect_200() {
        Assert.assertEquals((calculator.compositionNumber(-20, -10)), 200, 0 );
    }

    @Test
    public void division_1_Div_10_Expect_0_1() {
        Assert.assertEquals((calculator.divisionNumber(1, 10)), 0.1, 0 );
    }

    @Test
    public void division_Minus1_Div_10_Expect_Minus0_1() {
        Assert.assertEquals((calculator.divisionNumber(-1, 10)), -0.1, 0 );
    }

    @Test
    public void division_Minus10_Div_Minus10_Expect_1() {
        Assert.assertEquals((calculator.divisionNumber(-10, -10)), 1, 0 );
    }

    @Test
    public void division_0_Div_10_Expect_0() {
        Assert.assertEquals((calculator.divisionNumber(0, 10)), 0, 0 );
    }

 //   @Test
//   public void division_0_Div0_Expect_0() {
//        Input input = new Input();
//        Assert.assertEquals(input.inputN("90"),90,0);
//       // Assert.assertEquals(input.inputN(123), 123);
//        //Assert.assertEquals((input.inputN(123)), 123, 0);
//    }
//        Input input = new Input();
//        String fff = "ghj";
//        Assert.assertEquals(10.0, input.inputN(fff),0);
//


//       calculator.divisionNumber(1, 0);
}




