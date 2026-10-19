package ru.bmstu.lab1.task_9;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 9. Проверка отсортированности: вывести YES для неубывающего массива, иначе NO. */
public final class Task9 {
    private Task9() {}

    /** Проверяет неубывание; равные соседние элементы допустимы. */
    public static boolean solve(int[] values) {
        for (int index = 1; index < values.length; index++) {
            if (values[index] < values[index - 1]) {
                return false;
            }
        }
        return true;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values) ? "YES" : "NO");
        }
    }
}
