package com.company;
import static java.lang.System.*;
import java.util.Locale;
import java.util.regex.*;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Answer 1 = " + oppositeHouse(1, 3));
        System.out.println("Answer 2 = " + nameShuffle("Donald Trump"));
        System.out.println("Answer 3 = " + discount(89, 20));
        System.out.println("Answer 4 = " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("Answer 5 = " + equal(1, 1, 1));
        System.out.println("Answer 6 = " + reverse("Hello World"));
        System.out.println("Answer 7 = " + programmers(1, 5, 9));
        System.out.println("Answer 8 = " + getXO("ooxx"));
        System.out.println("Answer 9 = " + bomb("There is a bomb."));
        System.out.println("Answer 10 = " + sameAscii("AA", "B@"));
    }

    /* *1) Теша шел по прямой улице, по обеим сторонам которой стояло ровно n
	одинаковых домов. Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
	Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер
	дома на противоположной стороне* */
    public static int oppositeHouse(int nomer, int dl) {
        int[] chetn = new int[dl];
        int[] nechetn = new int[dl];
        for (int i = 0; i < dl; i++) {
            for (int k = 1; k < 2 * dl + 1; k++) {
                if (k % 2 == 0) {
                    chetn[i] = k;
                } else {
                    nechetn[i] = k;
                }
            }
        }
        if (nomer % 2 == 0) {
            return nechetn[nomer];
        } else {
            return chetn[nomer];
        }
    }

    /* ************************************************************* */

    /* *2)Создайте метод, который принимает строку (имя и фамилию человека) и
    возвращает строку с заменой имени и фамилии.* */
    public static String nameShuffle(String message) {

        String[] strings = message.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }
    /* ************************************************************* */

    /* *3)Создайте функцию, которая принимает два аргумента: исходную цену и процент
    скидки в виде целых чисел и возвращает конечную цену после скидки.* */
    public static double discount(double cost, double dis)
    {
        return cost - dis * cost / 100;
    }
    /* ************************************************************* */

    /* *4)Создайте функцию, которая принимает массив и возвращает разницу между
    наибольшим и наименьшим числами.* */
    public static int differenceMaxMin(int[] max_min) {
        int max = -100000;
        int min = 100000;
        for (int j : max_min) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        return max - min;
    }
    /* ************************************************************* */

    /* *5)Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и
    возвращает количество целых чисел, имеющих одинаковое значение.* */
    public static int equal(int a, int b, int c) {
        int kol_vo = 0;
        if (a == b) kol_vo++;
        if (a == c) kol_vo++;
        if (b == c) kol_vo++;
        if (((a == c) & (a != b)) || ((b == c) & (a != b)) || ((a == b) & (a != c))) kol_vo++;
        return kol_vo;

    }

    /* ************************************************************* */

    /* *6)Создайте метод, который принимает строку в качестве аргумента и возвращает ее в
    обратном порядке.* */
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    /* ************************************************************* */

    /* *7)Вы наняли трех программистов и платите им. Создайте функцию,
    которая принимает три числа (почасовая заработная плата каждого программиста)
    и возвращает разницу между самым высокооплачиваемым программистом и самым
    низкооплачиваемым* */
    public static int programmers(int pr1, int pr2, int pr3) {
        int maxzp;
        int minzp;

        maxzp = Math.max(pr1, Math.max(pr2, pr3));
        minzp = Math.min(pr1, Math.min(pr2, pr3));
        return maxzp - minzp;
    }

    /* ************************************************************* */

    /* *8)Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое
    количество x и o и возвращает либо true, либо false.* */
    public static boolean getXO(String s) {
        int countX = 0, countO = 0;
        char[] t = s.toCharArray();
        for (char c : t) {
            if (c == 'x' || c == 'X') countX++;
            if (c == 'o' || c == 'O') countO++;
        }
        return countO == countX;
    }

    /* ************************************************************* */

    /* *.* */
    public static String bomb(String str) {
        String d;
        if (str.contains("bomb") || str.contains("Bomb") || str.contains("BOMB")) {
            d = "DUCK!";
        } else {
            d = "Relax, there's no bomb";
        }
        return d;
    }
    /* ************************************************************* */

    /* *Возвращает true, если сумма значений ASCII первой строки совпадает с суммой
    значений ASCII второй строки, в противном случае возвращает false.* */
    public static boolean sameAscii (String character1, String character2){
        int Sum1=0;
        int Sum2=0;
        char[] ascii1 = character1.toCharArray();
        char[] ascii2 = character2.toCharArray();
        for (char c : ascii1) {
            Sum1 += c;
        }
        for (char c : ascii2) {
            Sum2 += c;
        }
        return Sum1==Sum2;
    }
}
