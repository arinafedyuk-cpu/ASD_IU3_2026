package ru.bmstu.lab1.task_1;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 1. Максимум и минимум: найти минимальный и максимальный элементы массива. */
public final class Task1 {
    private Task1() {}

    /** Возвращает массив из двух чисел: минимума, затем максимума. */
    public static int[] solve(int[] values) {
        int minimum = values[0];
        int maximum = values[0];
        for (int index = 1; index < values.length; index++) {
            minimum = Math.min(minimum, values[index]);
            maximum = Math.max(maximum, values[index]);
        }
        return new int[] {minimum, maximum};
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(ConsoleIo.format(solve(values)));
        }
    }
}
