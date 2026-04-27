package ec.epn.edu.git.calculator;

public class Calculator {

    private int answer;

    public int addition(int a, int b) {
        answer = a + b;
        return answer;
    }

    public int subtraction(int a, int b) {
        answer = a - b;
        return answer;
    }

    public int multiplication(int a, int b) {
        answer = a * b;
        return answer;
    }

    public double division(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        answer = a / b;
        return answer;
    }

    public void timeout(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }
}