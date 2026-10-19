package ru.bmstu.lab1.task_11;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 11: обычные случаи, границы и точный консольный вывод. */
class Task11Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task11::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("3 1 4 8", "4\n"),
                Arguments.of("2 0 1", "0\n"),
                Arguments.of("2 1 0", "1\n"),
                Arguments.of("3 -9 -5 -1", "-5\n"),
                Arguments.of("3 7 7 7", "7\n"),
                Arguments.of("2 -2147483648 2147483647", "-2147483648\n"),
                Arguments.of("2 2147483647 -2147483648", "2147483647\n"),
                Arguments.of("3 0 100 101", "100\n"));
    }
}
