package ru.bmstu.lab1.task_2;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 2: обычные случаи, границы и точный консольный вывод. */
class Task2Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task2::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 3 8 3 8 2 3", "0\n"),
                Arguments.of("3 1 2 3 3", "2\n"),
                Arguments.of("2 1 2 9", "-1\n"),
                Arguments.of("4 5 8 8 2 8", "1\n"),
                Arguments.of("2 -2147483648 0 -2147483648", "0\n"));
    }
}
