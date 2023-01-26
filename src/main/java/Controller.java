public class Controller {

    public void start() {
        Menu menu = new Menu();

        System.out.println("Первое число");
        double numberFirst = menu.getNumber();
        System.out.println("Второе число");
        double numberSecond = menu.getNumber();
        menu.calculator(numberFirst, numberSecond);
    }
}
