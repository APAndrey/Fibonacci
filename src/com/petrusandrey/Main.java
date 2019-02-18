package com.petrusandrey;

public class Main {

    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2;

        for (int i = 0; i <= 12; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(n2 + " ");
        }
    }
}
