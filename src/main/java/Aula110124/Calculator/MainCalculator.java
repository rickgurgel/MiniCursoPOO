package Aula110124.Calculator;

import java.util.Scanner;

public class MainCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("----- Input first number:   -----");
            Double a = sc.nextDouble();
            System.out.println("----- Input second number:  -----");
            Double b = sc.nextDouble();

            System.out.println("----- Choose any operation: -----");
            System.out.println("----- --- -- 1 - sum -- --- -----");
            System.out.println("----- --- 2 - subtract  --- -----");
            System.out.println("----- --- 3 - multiply  --- -----");
            System.out.println("----- --- -4 - divide-  --- -----");
            int choice = sc.nextInt();

            Calculator calculator = new Calculator();

            switch (choice){
                case 1:
                    System.out.println(calculator.sum(a,b));
                    break;
                case 2:
                    System.out.println(calculator.subtract(a,b));
                    break;
                case 3:
                    System.out.println(calculator.multiply(a,b));
                    break;
                case 4:
                    System.out.println(calculator.divide(a,b));
                    break;
            }

            sc.close();
        }
}
