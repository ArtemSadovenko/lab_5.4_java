package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int n = 15, k;

        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();

        System.out.println(func0(k, n) + "\n" +func1(k, n, k)  + "\n" + func2(k, n, n)  +
                "\n"+ func3(k, n, k, 0)  + "\n" + func4(k, n, n, 0)  );
    }
    public static double func0(int k, int n) {
        double s = 0.0f;
        for (int i = k; i <= n; i++) {
            s += cos(i) / (1f + pow(sin(i), 2));
        }
        return s;
    }

    public static double func1(int k, int n, int i) {
        if (i > n)
            return 0;
        else
            return cos(i) / (1.0 + pow(sin(i), 2)) + func1(k, n, i+1);
    }

    public static double func2(int k, int n, int i) {
        if (i < k)
            return 0;
        else
            return  cos(i) / (1.0 + pow(sin(i), 2)) + func2(k, n, i - 1);
    }

    public static double func3(int k, int n, int i, double t) {
        t += cos(i) / (1.0 + pow(sin(i), 2));
        if (i >= n)
            return t;
        else
            return func3(k, n, i + 1, t);
    }

    public static double func4(int k, int n, int i, double t) {
        t += cos(i) / (1.0 + pow(sin(i), 2));
        if (i <= k)
            return t;
        else
            return func4(k, n, i - 1, t);
    }

}
