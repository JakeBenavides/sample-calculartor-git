package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==  Calculator Execute  ==");

        Calculator c = new Calculator();

        int addition = c.addition(4, 7);
        System.out.println("Addition: c.addition(4, 7) =" + addition);

        int  subtraction = c.subtraction(7, 1);
        System.out.println("Subtraction: c.subtraction(4, 7) =" + subtraction);


        System.out.println("==== This is a change ====");
    }
}
