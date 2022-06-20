package main.HomeWork.L5.L5_T6_2Rec_SummDigit;

import java.util.Scanner;

public class SummOfDigits {
    public static void main(String[] arg) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Результат:" + summ(n));
        in.close();
    }
        private static int summ(int x){
            if (x<10 & x%10 == 0) {
                return 0;
            }
            return x%10 + summ(x/10);
        }
    }