package ru.bmstu.lab1.task_4;

import java.util.Arrays;
import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 4. Все индексы элемента: вывести индексы вхождений x в порядке возрастания. */
public final class Task4 {
    private Task4() {}

    /** Возвращает индексы совпадений, сохраняя порядок исходного массива. */
    public static int[] solve(int[] values, int target) {
        int[] indices = new int[values.length];
        int count = 0;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) {
                indices[count++] = index;
            }
        }
        return Arrays.copyOf(indices, count);
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(ConsoleIo.format(solve(values, scanner.nextInt())));
        }
    }
}
