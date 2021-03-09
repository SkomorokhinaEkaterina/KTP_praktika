package com.company;

public class praktika1 {

    public static void main(String[] args)
    {
        convert(5);
        points (13,12);
        footballPoints (3,4,2);
        divisibleByFive (5);
        and (true, false);
        howManyWalls (54, 1, 43);
        squared(5);
        profitableGamble( 0.9, 1, 2);
        frames(10, 25);
        mod (5, 2);
    }

    //1. Напишите функцию, которая принимает целое число минут и преобразует его в
    //секунды.

    private static void convert(int i)
    {
        int time = 0;
        time = i *60;
        System.out.println("Answer 5 = " + time);
    }

    //2. Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х
    //и 3-х очков, находите окончательные очки для команды и возвращаете это
    //значение

    private static void points(int ball2, int ball3)
    {
        int kol_ochkov = 0;
        kol_ochkov = 2* ball2 + 3*ball3;
        System.out.println("Answer 2  = " + kol_ochkov);
    }

    //3. Создайте функцию, которая принимает количество побед, ничьих и поражений и
    //вычисляет количество очков, набранных футбольной командой на данный момент.
    //выигрыш – получают 3 очка
    //ничья – получают 1 очко
    //проигрыш – получают 0 очков

    static void footballPoints(int pobeda, int nich, int proigr)
    {
        int points =0;
        points = 3*pobeda + 1* nich + 0*proigr;
        System.out.println("Answer 3  = " + points);
    }

    //4. Создайте функцию, которая возвращает true, если целое число равномерно делится
    //на 5, и false в противном случае.

    private static void divisibleByFive(int div5)
    {
        if (div5 % 5 == 0)
        {
            System.out.println("Answer 4  = " + true);
        }
        else System.out.println("Answer 4  = " + false);
    }

    //5. В Java есть логический оператор &&. Оператор && принимает два логических
    //значения и возвращает true, если оба значения истинны.
    //Рассмотрим a && b:
    //a проверяется, является ли оно истинным или ложным.
    //Если a равно false, возвращается false.
    //b проверяется, является ли оно истинным или ложным.
    //Если b имеет значение false, возвращается значение false.
    //В противном случае возвращается true (поскольку и a, и b, следовательно, истинны ).
    //Оператор && вернет true только для true && true.
    //Создайте функцию с помощью оператора&&.

    static void and(boolean r, boolean rr)
    {
        boolean rez;
        rez = r && rr;
        System.out.println("Answer 5  = " + rez);
    }

    //6. У меня есть ведро с большим количеством темно-синей краски, и я хотел бы
    //покрасить как можно больше стен. Создайте функцию, которая возвращает
    //количество полных стен, которые я могу покрасить, прежде чем мне нужно будет
    //отправиться в магазины, чтобы купить еще.
    //n - это количество квадратных метров, которые я могу нарисовать.
    //w и h-это ширина и высота одной стены в метрах.

    static void howManyWalls  (int kvad_metr, int width, int height)
    {
        int kol_sten = 0;
        kol_sten = kvad_metr/(width*height);
        System.out.println("Answer 6 =  " + kol_sten);
    }

    //7. Исправить код
    static void squared (int number)
    {
        int square = 0;
        square = number*number;
        System.out.println("Answer 7 =  " + square);
    }

    //8. Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает
    //true, если prob * prize > pay; в противном случае возвращает false.

    static void profitableGamble  (double prob, int prize, int pay)
    {
        if (prob * prize > pay)
        {
            System.out.println("Answer 8  = " + true);
        }
        else
            System.out.println("Answer 8  = " + false);
    }

    //9. Создайте метод, который возвращает количество кадров, показанных за заданное
    //количество минут для определенного FPS.

    static void frames (int FPS, int k)
    {
        int fpskolvo = 0;
        fpskolvo = FPS*k*60;
        System.out.println("Answer 9 =  " + fpskolvo);
    }

    //10. Создайте функцию, которая будет работать как оператор модуля % без
    //использования оператора модуля. Оператор модуля-это способ определения
    //остатка операции деления. Вместо того чтобы возвращать результат деления,
    //операция по модулю возвращает остаток целого числа.

    static void mod(int a, int b)
    {
        int ost = 0;
        ost = a-a/b*b;
        System.out.println("Answer 10 =  " + ost);
    }
}
