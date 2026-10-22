package ru.bmstu.lab1.task_38;

import java.util.Scanner;
import ru.bmstu.lab1.common.ArrayReversal;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 38. Циклический сдвиг влево: сдвинуть массив на k позиций тройным разворотом. */
public final class Task38 {
    private Task38() {}

    /** Сдвигает массив на месте; отрицательный сдвиг означает движение вправо. */
    public static void solve(int[] values, int distance) {
        int shift = Math.floorMod(distance, values.length);
        if (shift == 0) {
            return;
        }
        // Для частей A и B: reverse(reverse(A) + reverse(B)) = B + A.
        ArrayReversal.reverse(values, 0, shift);
        ArrayReversal.reverse(values, shift, values.length);
        ArrayReversal.reverse(values, 0, values.length);
    }

    /** Читает данные из стандартного ввода и печатает ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            solve(values, scanner.nextInt());
            System.out.println(ConsoleIo.format(values));
        }
    }
}
