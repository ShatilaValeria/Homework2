import java.util.Scanner;

public class Controller {

    public void start() {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        Input dataInput = new Input();

        System.out.println("Первое число");
        menu.getNumber();
        String input = scanner.next();
        double numberFirst = dataInput.inputNumber(input);

        System.out.println("Второе число");
        menu.getNumber();
        input = scanner.next();
        double numberSecond = dataInput.inputNumber(input);

        menu.calculator(numberFirst, numberSecond);
    }
}
