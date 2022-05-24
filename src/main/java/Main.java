public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double x = 1d;
        double y = 2d;

        Double sum = calculator.sum(x, y);

        System.out.println("Sum " + x + " + " + y + " = " + sum);

    }

}
