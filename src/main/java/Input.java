import java.util.Scanner;

public class Input implements DataInput {

    private double isNumDouble;
    private int isNumInt;
    Scanner scanner = new Scanner(System.in);

    @Override
    public double inputNumber(String number) {
        try {
            isNumDouble = Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Некорректный ввод данных. Попробуйте снова!");
            System.out.println("Введите число (разделение дробного от целого через '.')");
            String input = scanner.next();
            inputNumber(input);
            //System.exit(0);
        }
        return isNumDouble;
    }

    @Override
    public int inputOperation(String numberOperation) {
        try {
            isNumInt = Integer.parseInt(numberOperation);
        } catch (Exception e) {
            System.out.println("Некорректный ввод данных. Попробуйте снова!");
            System.out.println("Выберите номер операции с цислами:\n" +
                    "1 Сложение\n" +
                    "2 Вычитание\n" +
                    "3 Умножение\n" +
                    "4 Деление\n" +
                    "5 Выход");
            String input = scanner.next();
            inputOperation(input);
            //System.exit(0);
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
