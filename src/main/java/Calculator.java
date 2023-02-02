public class Calculator implements CalculatorOperations {

    public double sumNumber(double numberFirst, double numberSecond) {
        return numberFirst + numberSecond;
    }

    public double differenceNumber(double numberFirst, double numberSecond) {
        return numberFirst - numberSecond;
    }

    public double compositionNumber(double numberFirst, double numberSecond) {
        return numberFirst * numberSecond;
    }

    public double divisionNumber(double numberFirst, double numberSecond) {
        return numberFirst / numberSecond;
    }

}