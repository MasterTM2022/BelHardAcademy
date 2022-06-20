package main.HomeWork.L5.L5_T5_1Rec_Summ1N;

import java.util.Scanner;

public class Summ1N {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Результат:" + summ(n));
        in.close();
    }
        private static int summ(int x){
            if (x == 0) {
                return 0;
            }
            return x + summ(x - 1);
        }
    }
