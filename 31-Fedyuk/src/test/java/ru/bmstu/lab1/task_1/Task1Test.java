package ru.bmstu.lab1.task_1;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 1: обычные случаи, границы и точный консольный вывод. */
class Task1Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task1::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 3 -1 9 0 4", "-1 9\n"),
                Arguments.of("2 7 7", "7 7\n"),
                Arguments.of("3 -3 -9 -5", "-9 -3\n"),
                Arguments.of("2 2147483647 -2147483648", "-2147483648 2147483647\n"),
                Arguments.of("2 -2147483648 2147483647", "-2147483648 2147483647\n"));
    }
}
