package ru.bmstu.lab1.task_6;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 6. Элементы больше среднего: посчитать элементы строго больше целого среднего. */
public final class Task6 {
    private Task6() {}

    /** Возвращает количество элементов выше среднего; сумма должна делиться на n. */
    public static int solve(int[] values) {
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        long average = sum / values.length;
        int count = 0;
        for (int value : values) {
            if (value > average) {
                count++;
            }
        }
        return count;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values));
        }
    }
}
