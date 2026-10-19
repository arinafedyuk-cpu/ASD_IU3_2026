package ru.bmstu.lab1.task_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 12. Пара с заданной суммой: найти i < j, минимизируя сначала i, затем j. */
public final class Task12 {
    private Task12() {}

    /** Возвращает индексы требуемой пары или {-1, -1}, не изменяя входной массив. */
    public static int[] solve(int[] values, long targetSum) {
        IndexedElement[] sorted = new IndexedElement[values.length];
        for (int index = 0; index < values.length; index++) {
            sorted[index] = new IndexedElement(values[index], index);
        }
        Arrays.sort(
                sorted,
                Comparator.comparingInt(IndexedElement::value)
                        .thenComparingInt(IndexedElement::index));
        for (int first = 0; first < values.length; first++) {
            long complement = targetSum - values[first];
            int position = lowerBound(sorted, complement, first + 1);
            if (position < sorted.length && sorted[position].value() == complement) {
                return new int[] {first, sorted[position].index()};
            }
        }
        return new int[] {-1, -1};
    }

    // Ищем первую пару (значение, индекс), не меньшую (complement, minimumIndex).
    // Внутри равных значений сортировка по индексу сразу даёт минимальный j > i.
    private static int lowerBound(IndexedElement[] sorted, long complement, int minimumIndex) {
        int left = 0;
        int right = sorted.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            IndexedElement element = sorted[middle];
            if (element.value() < complement
                    || (element.value() == complement && element.index() < minimumIndex)) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(ConsoleIo.format(solve(values, scanner.nextLong())));
        }
    }
}
