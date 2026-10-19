package ru.bmstu.lab1.task_12;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 12: обычные случаи, границы и точный консольный вывод. */
class Task12Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task12::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("4 2 7 11 15 9", "0 1\n"),
                Arguments.of("4 1 2 3 4 5", "0 3\n"),
                Arguments.of("4 2 3 3 2 5", "0 1\n"),
                Arguments.of("2 3 3 6", "0 1\n"),
                Arguments.of("3 1 2 4 8", "-1 -1\n"),
                Arguments.of("3 1 2 3 20", "-1 -1\n"),
                Arguments.of("3 1 2 3 -20", "-1 -1\n"),
                Arguments.of("3 0 0 0 0", "0 1\n"),
                Arguments.of("4 10 -5 4 1 -4", "1 3\n"),
                Arguments.of("2 -2147483648 2147483647 -1", "0 1\n"),
                Arguments.of("2 2147483647 2147483647 -2", "-1 -1\n"),
                Arguments.of("2 2147483647 2147483647 4294967294", "0 1\n"));
    }
}
