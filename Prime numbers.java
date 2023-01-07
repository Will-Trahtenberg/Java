package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean True = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    True = false;
                    break;
                }
            }
            if (True) {
                System.out.println(i);
            }
        }
    }
}
