package Payroll;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter id number");
            int id = scanner.nextInt();

            System.out.println("enter gross pay");
            int grosspay = scanner.nextInt();

            System.out.println("enter federal tax");
        }
    }
}