public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double x = 1d;
        double y = 2d;

        Double sum = calculator.sum(x, y);
        Double substrat = calculator.substrat(x, y);

        System.out.println("Sum " + x + " + " + y + " = " + sum);
        System.out.println("Substract " + x + " - " + y + " = " + substrat);

    }

}
