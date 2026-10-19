package ru.bmstu.lab1.task_3;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 3. Подсчёт вхождений: определить количество элементов, равных x. */
public final class Task3 {
    private Task3() {}

    /** Возвращает количество вхождений искомого значения. */
    public static int solve(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values, scanner.nextInt()));
        }
    }
}
