package eu.noelroger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre:");
        int nombre = scanner.nextInt();
        if (nombre % 5 == 0 && nombre % 3 ==0)
            System.out.println("FizzBuzz");
        else if (nombre % 5 == 0)
            System.out.println("Buzz");
        else if (nombre % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(nombre);
        scanner.close();
    }
}
