package org.example;

public class Task2 {
    public static void main(String[] args) {
        // 3 + 53 = 56 при помощи StringBuilder знак = поменять на слово равно

        StringBuilder builder = new StringBuilder("3 + 53 = 56"); // Создаем объект StringBuilder и инициализируем его строкой "3 + 53 = 56"
        int x = builder.indexOf("="); // Получаем индекс символа "=" в строке, используя метод indexOf()
        builder.replace(x, x + 1, "равно"); // Заменяем символ "=" на строку "равно" с помощью метода replace()
        System.out.println(builder); // Выводим измененную строку на экран с помощью метода println()
    }
}
