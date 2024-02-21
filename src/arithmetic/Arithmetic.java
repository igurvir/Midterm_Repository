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
enum ArithmeticOperation {
    PLUS, MINUS, TIMES, DIVIDE
}

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Enter arithmetic operation to Perform: ");
        String operationInput = in.next();

        ArithmeticOperation operation;
        try {
            operation = ArithmeticOperation.valueOf(operationInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arithmetic operation provided. Please enter PLUS, MINUS, TIMES, or DIVIDE.");
            return;
        }

        double result = r.calculate(m, n, operation);
        System.out.println("result: " + result);
    }
}

