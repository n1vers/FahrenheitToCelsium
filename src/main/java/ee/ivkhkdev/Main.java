package ee.ivkhkdev;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        float Fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ведите температуру  в цельсия:");
        float number = scanner.nextFloat();
        Fahrenheit = ((number * 9) / 5) + 32;
        System.out.printf("температура в фаренгейтах: %.2f",Fahrenheit);
    }
}