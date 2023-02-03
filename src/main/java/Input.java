public class Input implements DataInput {

    private double isNumDouble;
    private int isNumInt;

    @Override
    public double inputNumber(String number) {
        try {
            isNumDouble = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод данных. Перезапустите программу и попробуйте снова!");
            throw new NumberFormatException("Некорректный ввод данных");
        }
        return isNumDouble;
    }

    @Override
    public int inputOperation(String numberOperation) {
        try {
            isNumInt = Integer.parseInt(numberOperation);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод данных.  Перезапустите программу и попробуйте снова!");
            throw new NumberFormatException("Некорректный ввод данных");
        }
        return isNumInt;
    }

    public double getIsNumDouble() {
        return isNumDouble;
    }

    public void setIsNumDouble(double isNumDouble) {
        this.isNumDouble = isNumDouble;
    }

    public int getIsNumInt() {
        return isNumInt;
    }

    public void setIsNumInt(int isNumInt) {
        this.isNumInt = isNumInt;
    }
}
