package org.example;

import java.util.Scanner;

// Создать две строки и проверить являются ли они вращением друг друга (вхождением в обратном порядке)?
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Создание объекта Scanner для ввода данных с консоли
        System.out.println("Введите первую строку"); // Вывод на экран приглашения ввести первую строку
        String str1 = in.nextLine(); // Чтение первой строки с консоли
        System.out.println("Введите вторую строку"); // Вывод на экран приглашения ввести вторую строку
        String str2 = in.nextLine(); // Чтение второй строки с консоли

        StringBuilder builder = new StringBuilder(str2); // Создание объекта StringBuilder на основе второй строки
//        builder.reverse(); // и его реверсирование (переворот)
        str2 = builder.reverse().toString(); // Присвоение переменной str2 значения перевернутой второй строки

        if (str1.equals(str2)) { // Сравнение первой и перевернутой второй строк. Если они равны, выводится "Да", иначе "Нет!"
            System.out.println("Да");
        } else System.out.println("Нет!");

    }
}
