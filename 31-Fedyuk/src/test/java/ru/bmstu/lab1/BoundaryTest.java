package ru.bmstu.lab1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import ru.bmstu.lab1.task_1.Task1;
import ru.bmstu.lab1.task_10.Task10;
import ru.bmstu.lab1.task_11.Task11;
import ru.bmstu.lab1.task_2.Task2;
import ru.bmstu.lab1.task_3.Task3;
import ru.bmstu.lab1.task_4.Task4;
import ru.bmstu.lab1.task_5.Task5;
import ru.bmstu.lab1.task_6.Task6;
import ru.bmstu.lab1.task_7.Task7;
import ru.bmstu.lab1.task_8.Task8;
import ru.bmstu.lab1.task_9.Task9;

/** Проверки максимально допустимой длины и арифметики на границах int. */
class BoundaryTest {
    private static final int MAX_VALID_SIZE = 99_999;

    @Test
    void shouldHandleLargeEqualValuesWithoutSumOverflow() {
        int[] values = new int[MAX_VALID_SIZE];
        Arrays.fill(values, Integer.MAX_VALUE);
        assertArrayEquals(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}, Task1.solve(values));
        assertEquals(-1, Task2.solve(values, 0));
        assertEquals(MAX_VALID_SIZE, Task3.solve(values, Integer.MAX_VALUE));
        assertEquals(0, Task6.solve(values));
        assertEquals(Integer.MAX_VALUE, Task11.solve(values));
        long evenIndexCount = (MAX_VALID_SIZE + 1L) / 2;
        assertEquals(evenIndexCount * Integer.MAX_VALUE, Task5.solve(values));
    }

    @Test
    void shouldReturnEveryMatchingIndexInLargeArray() {
        int[] expected = increasingArray();
        assertArrayEquals(expected, Task4.solve(new int[MAX_VALID_SIZE], 0));
    }

    @Test
    void shouldHandleLargeOrderedDistinctArray() {
        int[] values = increasingArray();
        assertEquals(MAX_VALID_SIZE - 2, Task7.solve(values));
        assertTrue(Task9.solve(values));
        assertEquals(MAX_VALID_SIZE - 1, Task10.solve(values, 1));
    }

    @Test
    void shouldPreserveAllPositiveElementsWhenFilteringLargeArray() {
        int[] values = new int[MAX_VALID_SIZE];
        Arrays.fill(values, 1);
        int[][] actual = Task8.solve(values);
        assertArrayEquals(values, actual[0]);
        assertEquals(0, actual[1].length);
    }

    @Test
    void shouldRejectZeroDivisorExplicitly() {
        assertThrows(IllegalArgumentException.class, () -> Task10.solve(new int[] {0, 2}, 0));
    }

    private static int[] increasingArray() {
        int[] values = new int[MAX_VALID_SIZE];
        for (int index = 0; index < values.length; index++) {
            values[index] = index;
        }
        return values;
    }
}
