package utils;

import java.util.Scanner;

public class ChangeToBraket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String newStr = input
                .replace('[', '{')
                .replace(']', '}');

        System.out.println(newStr);
    }
}
