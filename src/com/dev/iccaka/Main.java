package com.dev.iccaka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, g, a, b, ag, bg, a_abg, b_abg;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter modulo - p:");
        n = sc.nextInt();

        System.out.println("Enter primitive root of p - g:");
        g = sc.nextInt();

        System.out.println("Enter Alice's private key - x:");
        a = sc.nextInt();

        System.out.println("Enter Bob's private key - y:");
        b = sc.nextInt();

        ag = (int) Math.pow(g, a) % n;
        bg = (int) Math.pow(g, b) % n;

        a_abg = (int) Math.pow(bg, a) % n;
        b_abg = (int) Math.pow(ag, b) % n;

        if (a_abg == b_abg) {
            System.out.println("Alice and Bob can communicate with each other!");
            System.out.println("The secret number they share is: " + a_abg);
        } else {
            System.out.println("Alice and Bob cannot communicate with each other!");
        }
    }
}
