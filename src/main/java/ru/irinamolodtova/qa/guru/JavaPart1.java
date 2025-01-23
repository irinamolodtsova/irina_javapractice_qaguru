package ru.irinamolodtova.qa.guru;

public class JavaPart1 {
    public static void main(String[] args) {

        int first = 2;
        int second = 8;
        double third = 1.5;
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(second / first);
        System.out.println("1) применить несколько арифметических операций над int и double в одном выражении");
        System.out.println((second + third / first) * third - first);
        System.out.println("2) применить несколько логических операций ( < , >, >=, <= )");
        System.out.println(first + second < second + third);
        System.out.println(second * third > first * second);
        System.out.println(second >= first);
        System.out.println(third <= first);
        System.out.println("3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение");
        System.out.println("4) получить переполнение при арифметической операции");
        System.out.println(maxFloat + 20);
        System.out.println(maxDouble + 20);
        System.out.println(minFloat - 2);
        System.out.println(minDouble - 2);




    }
}