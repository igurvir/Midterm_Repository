/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
import java.util.Scanner;

enum ArithmeticOperation {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y != 0) {
                return x / y;
            } else {
                System.out.println("Cannot divide by zero.");
                return Double.NaN; 
            }
        }
    };

    public abstract double apply(double x, double y);
}

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n = in.nextDouble();
        System.out.println("Enter second number: ");
        double m = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform: ");
        try {
            ArithmeticOperation operation = ArithmeticOperation.valueOf(in.next().toUpperCase());
            double result = r.calculate(m, n, operation);
            System.out.println("result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arithmetic operation provided. Please enter PLUS, MINUS, TIMES, or DIVIDE.");
        }
    }
}

