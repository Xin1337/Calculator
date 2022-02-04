package com.nix;

import java.util.Scanner;

public class Main {

    public static int x;
    public static int y;

    public static int addition() {
        return (x + y);
    }

    public static int subtraction() {
        return (x - y);
    }

    public static int multiplication() {
        return (x * y);
    }

    public static double division() {
        Double d = new Double(x);
        Double d2 = new Double(y);
        return (d / d2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        x = sc.nextInt();
        System.out.print("Enter Number 2: ");
        y = sc.nextInt();

        System.out.println("[1] for Addition");
        System.out.println("[2] for Subtraction");
        System.out.println("[3] for Multiplication");
        System.out.println("[4] for Division");

        String resp = sc.next();

        if (resp.equals("1")) {
            System.out.print(addition());
        } else if (resp.equals("2")) {
            System.out.print(subtraction());
        } else if (resp.equals("3")) {
            System.out.print(multiplication());
        } else if (resp.equals("4")) {
            System.out.print(division());
        }
    }
}