package ru.bmstu.lab1.task_26;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 26. Произведение элементов: вычислить произведение по модулю 10^9 + 7. */
public final class Task26 {
    private Task26() {}

    private static final long MODULUS = 1_000_000_007L;

    /** Возвращает неотрицательный остаток произведения, в том числе для отрицательных чисел. */
    public static long solve(int[] values) {
        long product = 1;
        for (int value : values) {
            // Оба множителя меньше MODULUS, поэтому их произведение помещается в long.
            long remainder = Math.floorMod((long) value, MODULUS);
            product = product * remainder % MODULUS;
        }
        return product;
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values));
        }
    }
}
