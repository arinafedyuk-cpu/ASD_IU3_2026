package ru.bmstu.lab1.common;

import java.util.Scanner;

/** Общие операции чтения массива и форматирования ответа для задач лабораторной. */
public final class ConsoleIo {
    private static final int MIN_SIZE = 2;
    private static final int MAX_SIZE_EXCLUSIVE = 100_000;

    private ConsoleIo() {}

    /** Читает размер и элементы массива, проверяя ограничение 1 < n < 100000. */
    public static int[] readArray(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < MIN_SIZE || size >= MAX_SIZE_EXCLUSIVE) {
            throw new IllegalArgumentException("Размер массива должен быть от 2 до 99999");
        }
        int[] values = new int[size];
        for (int index = 0; index < size; index++) {
            values[index] = scanner.nextInt();
        }
        return values;
    }

    /** Форматирует массив через пробел; для пустого массива возвращает пустую строку. */
    public static String format(int[] values) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < values.length; index++) {
            if (index > 0) {
                result.append(' ');
            }
            result.append(values[index]);
        }
        return result.toString();
    }
}
