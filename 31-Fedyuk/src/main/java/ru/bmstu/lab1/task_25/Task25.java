package ru.bmstu.lab1.task_25;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 25. Сумма элементов: найти сумму всех чисел массива. */
public final class Task25 {
    private Task25() {}

    /** Возвращает сумму в long, чтобы избежать переполнения int. */
    public static long solve(int[] values) {
        long total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values));
        }
    }
}
