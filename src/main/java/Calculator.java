public class Calculator implements CalculatorOperations {

    public double sumNumber(double numberFirst, double numberSecond) {
        return numberFirst + numberSecond;
    }

    public double differenceNumber(double numberFirst, double numberSecond) {
        return numberFirst - numberSecond;
    }

    public double multiplicationNumber(double numberFirst, double numberSecond) {
        return numberFirst * numberSecond;
    }

    public double divisionNumber(double numberFirst, double numberSecond) {
        if(!(numberSecond == 0)) {
            return numberFirst / numberSecond;
        } else {
            throw new ArithmeticException();
        }
    }

}