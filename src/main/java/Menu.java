import java.util.Scanner;

public class Menu implements CalculatorMenu {

    private double number;
    private int numberOperation;

    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    public void calculator(double numberFirst, double numberSecond) {
        do {
            switch (getOperation()) {
                case 1:
                    System.out.println(numberFirst + " + " + numberSecond + " = " +
                            calculator.sumNumber(numberFirst, numberSecond));
                    break;
                case 2:
                    System.out.println(numberFirst + " - " + numberSecond + " = " +
                            calculator.differenceNumber(numberFirst, numberSecond));
                    break;
                case 3:
                    System.out.println(numberFirst + " * " + numberSecond + " = " +
                            calculator.compositionNumber(numberFirst, numberSecond));
                    break;
                case 4:
                    if (numberSecond == 0) {
                        System.out.println("На ноль делить нельзя");
                    } else {
                        System.out.println(numberFirst + " / " + numberSecond + " = " +
                                calculator.divisionNumber(numberFirst, numberSecond));
                    }
                    break;
                case 5:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Неккоректный ввод данных");
            }
        } while (true);
    }

    public int getOperation() {
        System.out.println("Выберите номер операции с цислами:\n" +
                "1 Сложение\n" +
                "2 Вычитание\n" +
                "3 Умножение\n" +
                "4 Деление\n" +
                "5 Выход");

        if (scanner.hasNextInt()) {
            numberOperation = scanner.nextInt();
        } else {
            System.out.println("Неккоректный ввод данных. Попробуйте еще раз.");
            scanner.next();
            numberOperation = getOperation();
        }
        return numberOperation;
    }

    public double getNumber() {
        System.out.println("Введите число (разделение дробного от целого через ','): ");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Некорректный ввод данных. Попробуйте снова!");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getNumberOperation() {
        return numberOperation;
    }

    public void setNumberOperation(int numberOperation) {
        this.numberOperation = numberOperation;
    }
}
