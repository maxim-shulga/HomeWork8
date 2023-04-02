package additional;

import java.util.Scanner;

public class Calculator {
    public double add(double op1, double op2)
    {
        return (op1 + op2);
    }
    public double mul(double op1, double op2)
    {
        return (op1 * op2);
    }
    public double sub(double op1, double op2)
    {
        return (op1 - op2);
    }
    public double div(double op1, double op2)
    {
        try {
            if (op2 == 0 ) throw new ArithmeticException("Division by zero");
            return (op1 / op2);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
class Main{
    public static void main (String[] args) {

        Calculator calc = new Calculator();
        double operand1, operand2;
        String operation;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter operand 1");
        operand1 = in.nextDouble();
        System.out.println("Enter operand 2");
        operand2 = in.nextDouble();
        System.out.println("Enter operation (+, -, *, /)");
        operation = in.next();

        switch (operation){
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", operand1, operand2, calc.add(operand1,operand2));
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", operand1, operand2, calc.sub(operand1,operand2));
                break;
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", operand1, operand2, calc.mul(operand1,operand2));
                break;
            case "/":
                System.out.printf("%.2f / %.2f = %.2f", operand1, operand2, calc.div(operand1,operand2));
                break;
            default:
                System.out.println("You entered incorrect operation");
        }
    }
}
