package Aula110124.Calculator;

import java.util.Scanner;

public class Menu {

    Calculator calculator = new Calculator();

    public void operationMenu(){
        System.out.println("----- Choose any operation: -----");
        System.out.println("----- --- 0 - exit      --- -----");
        System.out.println("----- --- 1 - sum       --- -----");
        System.out.println("----- --- 2 - subtract  --- -----");
        System.out.println("----- --- 3 - multiply  --- -----");
        System.out.println("----- --- 4 - divide    --- -----");
    }

    public void calculate(Integer choice){
        switch (choice){
            case 1:
                System.out.println(calculator.sum(calculator.getA(), calculator.getB()));
                break;
            case 2:
                System.out.println(calculator.subtract(calculator.getA(), calculator.getB()));
                break;
            case 3:
                System.out.println(calculator.multiply(calculator.getA(), calculator.getB()));
                break;
            case 4:
                System.out.println(calculator.divide(calculator.getA(), calculator.getB()));
                break;
        }

    }
    public void inputMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Input first number:   -----");
        calculator.setA(sc.nextDouble());
        System.out.println("----- Input second number:  -----");
        calculator.setB(sc.nextDouble());

        sc.close();
    }
}
