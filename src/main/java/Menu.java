import java.util.Scanner;

public class Menu implements CalculatorMenu {

    private int numberOperation;

    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    DataInput input = new Input();

    public void calculator(double numberFirst, double numberSecond) {
        do {
            getOperation();
            String num = scanner.next();
            int number = input.inputOperation(num);
            switch (number) {
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
                            calculator.multiplicationNumber(numberFirst, numberSecond));
                    break;
                case 4:
                    try {
                        System.out.print(numberFirst + " / " + numberSecond + " = ");
                        System.out.println(calculator.divisionNumber(numberFirst, numberSecond));
                    } catch (ArithmeticException e) {
                        System.out.println("На ноль делить нельзя");
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

    public void getOperation() {
        System.out.println("Выберите номер операции с цислами:\n" +
                "1 Сложение\n" +
                "2 Вычитание\n" +
                "3 Умножение\n" +
                "4 Деление\n" +
                "5 Выход");

//        if (scanner.hasNextInt()) {
//            numberOperation = scanner.nextInt();
//        } else {
//            System.out.println("Неккоректный ввод данных. Попробуйте еще раз.");
//            scanner.next();
//            numberOperation = getOperation();
//        }
    }

    public void getNumber() {
        System.out.println("Введите число (разделение дробного от целого через '.'): ");
    }

    public int getNumberOperation() {
        return numberOperation;
    }

    public void setNumberOperation(int numberOperation) {
        this.numberOperation = numberOperation;
    }
}
