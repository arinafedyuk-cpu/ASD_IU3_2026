package ru.bmstu.lab1.task_10;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 10: обычные случаи, границы и точный консольный вывод. */
class Task10Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task10::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 6 7 9 4 12 3", "4\n"),
                Arguments.of("3 6 7 5 3", "0\n"),
                Arguments.of("2 1 5 2", "-1\n"),
                Arguments.of("4 -6 5 0 7 -3", "2\n"),
                Arguments.of("2 0 1 4", "0\n"),
                Arguments.of("2 1 -2147483648 -1", "1\n"),
                Arguments.of("2 2 -2147483648 -2147483648", "1\n"));
    }
}
