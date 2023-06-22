package org.example;

import java.util.Arrays;

public class seminarSComentami {
    public static void main(String[] args) {

        String s = "Help!?";
//        String s1 = "Help!?";
        String s2 = "Hello World! Меня зовут Евгений! ";

        // s1 = s; // во время сборки ява уже приравнивает строки , так как они идентичны
        // System.out.println(s == s1); // так сравнивать строки нельзя, (не рекомендуется)
        // System.out.println(s.equals(s1)); // для сравнения строк используют equals вернёт true, equals()
        // отрабатывает корректней чем ==

        System.out.println(s.equals("!")); // если строка не равна то вернёт false
        System.out.println(s.contains("!")); // если во всей строке он встретит (в данном случае !), то вернёт true
        System.out.println(s.replace("!", "")); // меняет одно на другое, исходная строка остаётся, все методы
        // возвращают новую строку
        System.out.println(s.toUpperCase()); // все буквы делает большими
        System.out.println(s.toLowerCase()); // все буквы делает маленькими
        System.out.println(s.charAt(s.length() / 2)); // метод возвращает определённый символ по заданному индексу
        // (length()/2) в данном примере возвратит из середины строки
        System.out.println(s.indexOf("l")); // возвращает индекс искомого (здесь вернёт 2)
        System.out.println(s.indexOf("L")); // (здесь -1, т.к большой L нету) можно передавать последовательность
        // символ например "!?" вернёт 4, потому что "!"- находится по 4 индексу
        System.out.println(s.repeat(3)); // повторяет строчку, здесь 3 раза
        System.out.println(s.substring(s.length() / 2, s.length() - 1)); // достаёт из строки подстроку, первый аргумент
        // от куда начинать, второй где заканчивать здесь выведет p!- т.к начинается с середины строки и заканчивает
        // концом (последний знак убирает)
        String[] tmp = s2.split(" "); // создали массив и разделили по пробелу
        System.out.println(Arrays.toString(s2.split(" "))); // разделяет строку, здесь по пробелу, а может по любому знаку какой
        // поставить аргументом, возвращает массив строк [Help, World!, My, name, is, Евгений!]
        System.out.println(s2.lastIndexOf("!")); // находит по последнему индексу (ищет по индексу с конца)


        StringBuilder builder = new StringBuilder("Hello World! Меня зовут Евгений! "); // в отличии о String,
        // StringBuilder можно менять
        s = builder.toString(); // чтобы StringBuilder сделать строкой нужно вызвать метод toString(), теперь это строка
        builder.append("!"); // добавляет в конец строки, причём строка реально измениться
        builder.replace(0, builder.length() / 2, "??"); // в StringBuilder, replace надо задавать от куда, до куда, и на
        // что менять если надо поменять все значения, надо преобразовать в строку (builder.toString().replace();)
        System.out.println(builder);
        builder.deleteCharAt(8); // удаляет символ по его индексу
        builder.delete(builder.length() / 2, builder.length() - 1); // выберем диапазон от куда, до куда и удаляем это
        // (здесь от середины строки, до предпоследнего элемента)
        System.out.println(builder.reverse()); // переворачивает строчку
        builder = new StringBuilder(s2); // обновили строку
        builder.charAt(1); // так же как и в String возвращает определённый символ по заданному индексу
        builder.indexOf("!");
        builder.lastIndexOf("!"); // то же что и у String
        builder.insert(builder.indexOf("!"), "??"); // добавляет в строку подстроку здесь(Hello World??! Меня зовут
        // Евгений!) добавил два ?? перед первым !
        System.out.println(builder);
        builder.compareTo(new StringBuilder(s)); // сравнивает посимвольно строки
        builder.setCharAt(12, 'Z'); // заменяет символ по индексу
        System.out.println(builder);


        // сравниваем скорость работы String и StringBuilder
        String string = ""; // создаём пустую строку
        StringBuilder strBul = new StringBuilder(""); // создаём пустой StringBuilder

        long start = System.currentTimeMillis(); // запускаем счетчик времени
        for (int i = 0; i < 10000; i++) { // добавляем 10000 имен символов в строку
            string += Character.getName(i);
        }
        System.out.println(System.currentTimeMillis() - start); // выводим время, затраченное на операцию

        start = System.currentTimeMillis(); // запускаем счетчик времени
        for (int i = 0; i < 10000; i++) { // добавляем 10000 имен символов в StringBuilder
            strBul.append(Character.getName(i));
        }
        System.out.println(System.currentTimeMillis() - start); // выводим время, затраченное на операцию

    }
}
