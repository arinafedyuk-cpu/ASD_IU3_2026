package ru.bmstu.lab1.task_41;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 41. Удаление элемента: удалить все вхождения x, сохранив порядок остальных чисел. */
public final class Task41 {
    private Task41() {}

    /** Возвращает новый массив без искомого значения; исходный массив не изменяется. */
    public static int[] solve(int[] values, int target) {
        int remainingCount = 0;
        for (int value : values) {
            if (value != target) {
                remainingCount++;
            }
        }
        int[] remaining = new int[remainingCount];
        int nextIndex = 0;
        for (int value : values) {
            if (value != target) {
                remaining[nextIndex++] = value;
            }
        }
        return remaining;
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(ConsoleIo.format(solve(values, scanner.nextInt())));
        }
    }
}
