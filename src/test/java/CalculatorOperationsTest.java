import org.junit.Assert;
import org.junit.Test;


public class CalculatorOperationsTest {
    CalculatorOperations calculator = new Calculator();

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
    public void difference_22_Minus_Minus900_Expect_Minus16() {
        Assert.assertEquals((calculator.differenceNumber(22, -900)), 922, 0 );
    }


}
