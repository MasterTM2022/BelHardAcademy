package main.HomeWork.L6.T1;
//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
// Программа получает число n, задаваемое в программе, и раздает карты на n  игроков (по 5 карт каждому)
// из рассортированной колоды. Разделяйте пять карт, выданных каждому игроку, пустой строкой.

public class Deal {
    public static void main(String[] args) {
        final int PLAYER = 5;
        final int CARDS = 5;

        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int[][] deal = new int[suits.length][rank.length];
        if (suits.length * rank.length >= PLAYER * CARDS) {
            int suitsIndex, rankIndex;
            for (int i = 0; i < PLAYER; i++) {
                System.out.print("Player " + (i + 1) + " get: ");
                for (int j = 0; j < CARDS; j++) {
                    do {
                        suitsIndex = (int) (Math.random() * (suits.length ));
                        rankIndex = (int) (Math.random() * (rank.length ));
                        if (deal[suitsIndex][rankIndex] == 0) {
                            deal[suitsIndex][rankIndex] = suitsIndex + 100 * rankIndex;
                            System.out.print(rank[rankIndex] + " " + suits[suitsIndex] + ", ");
                            break;
                        }
                    } while (true);
                }
                System.out.println();
            }
        } else {
            System.out.println("Too many players and/or cards per player!!!");
        }
    }
}