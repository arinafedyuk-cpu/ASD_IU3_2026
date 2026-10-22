package ru.bmstu.lab1.task_36;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 36. Бегущая сумма: на позиции i записать сумму элементов с индексами от 0 до i. */
public final class Task36 {
    private Task36() {}

    /** Возвращает накопленные суммы в новом long-массиве, сохраняя исходные данные. */
    public static long[] solve(int[] values) {
        long[] sums = new long[values.length];
        long total = 0;
        for (int index = 0; index < values.length; index++) {
            total += values[index];
            sums[index] = total;
        }
        return sums;
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(ConsoleIo.format(solve(values)));
        }
    }
}
