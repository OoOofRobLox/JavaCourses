package ru.java.courses;

import java.sql.SQLOutput;

public class Lesson4_FlowControl {

    /**
     * В рамках задания необходимо найти в полученном массиве строк самую длинную
     * и вернуть ее в результате выполнени метода.
     * Если таких строк окажется несколько - возвращаем первую найденную.
     * <p>
     * Например, для массива {"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"}
     * ответом будет "Вишнеый сад".
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк случайной длины
     * @return самую длинную строку из полученного массива
     */
    public static String task1(String[] strings) {
        String minString = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > minString.length()) {
                minString = strings[i];
            }
        }
        return minString;
    }

    /**
     * В рамках задания необходимо реализовать микро-калькулятор.
     *  В качестве входных параметров будут два числа i и k, а так же символ указывающий на операцию:
     * + - сложение i и k
     * - - вычитание k из i
     * * - умножение i на k
     * / - деление i на k
     * % - остаток от деления i на k
     * <p>
     * Как мы помним, на 0 делить нельзя. В этом случае просто возвращаем 0.
     * <p>
     * Подсказка: переданный символ операции может быть не из списка выше
     *
     * @param i         первый числовой параметр
     * @param k         второй числовой параметр
     * @param operation символ, указывающий на операцию
     * @return целочисленный результат выполнения операции
     */
    public static int task2(int i, int k, char operation) {
        while (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
            if (operation == '+'){
                return i + k;
            } else if (operation == '-') {
                return i - k; 
            } else if (operation == '*') {
                return  i * k;
            } else if (operation == '/' && k != 0) {
                return i / k;
            } else if (operation == '%' && k != 0) {
                return i % k;
            } else return 0;
        }
        return 0;
    }
}
