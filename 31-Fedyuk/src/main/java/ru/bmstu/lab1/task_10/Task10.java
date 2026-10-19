package ru.bmstu.lab1.task_10;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 10. Поиск элемента с условием: найти последний индекс элемента, кратного ненулевому k. */
public final class Task10 {
    private Task10() {}

    /** Возвращает последний индекс кратного делителю элемента или -1. */
    public static int solve(int[] values, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Делитель не должен быть равен нулю");
        }
        for (int index = values.length - 1; index >= 0; index--) {
            if (values[index] % divisor == 0) {
                return index;
            }
        }
        return -1;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values, scanner.nextInt()));
        }
    }
}
