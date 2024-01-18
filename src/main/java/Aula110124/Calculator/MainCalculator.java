package Aula110124.Calculator;

import java.util.Scanner;


public class MainCalculator {
    static Menu menu = new Menu();

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            menu.operationMenu();
            int choice = sc.nextInt();
            if (choice == 0){
                System.exit(0);
            }
            menu.inputMenu();
            menu.calculate(choice);


            sc.close();
    }
}
