package ru.bmstu.lab1.task_5;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 5. Сумма элементов на чётных позициях: сложить элементы с индексами 0, 2, 4, ... */
public final class Task5 {
    private Task5() {}

    private static final int INDEX_STEP = 2;

    /** Возвращает сумму на чётных индексах; long предотвращает переполнение int. */
    public static long solve(int[] values) {
        long sum = 0;
        for (int index = 0; index < values.length; index += INDEX_STEP) {
            sum += values[index];
        }
        return sum;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values));
        }
    }
}
