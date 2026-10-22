package ru.bmstu.lab1.task_37;

import java.util.Scanner;
import ru.bmstu.lab1.common.ArrayReversal;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 37. Разворот массива: изменить порядок элементов на обратный без нового массива. */
public final class Task37 {
    private Task37() {}

    /** Разворачивает переданный массив на месте за O(n) времени и O(1) дополнительной памяти. */
    public static void solve(int[] values) {
        ArrayReversal.reverse(values, 0, values.length);
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            solve(values);
            System.out.println(ConsoleIo.format(values));
        }
    }
}
