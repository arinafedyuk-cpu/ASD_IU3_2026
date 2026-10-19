package ru.bmstu.lab1.task_2;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 2. Индекс первого вхождения: найти первый индекс числа x или вернуть -1. */
public final class Task2 {
    private Task2() {}

    /** Возвращает первый индекс искомого значения или -1, если его нет. */
    public static int solve(int[] values, int target) {
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) {
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
