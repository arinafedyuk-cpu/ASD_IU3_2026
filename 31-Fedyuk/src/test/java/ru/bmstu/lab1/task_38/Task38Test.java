package ru.bmstu.lab1.task_38;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 38 через стандартные потоки ввода и вывода. */
class Task38Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task38::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 2 3 4 5 2", "3 4 5 1 2\n"),
                Arguments.of("5 1 2 3 4 5 7", "3 4 5 1 2\n"),
                Arguments.of("3 4 5 6 0", "4 5 6\n"),
                Arguments.of("3 4 5 6 6", "4 5 6\n"),
                Arguments.of("2 1 2 1", "2 1\n"),
                Arguments.of("3 1 2 3 -1", "3 1 2\n"),
                Arguments.of("3 1 2 3 2147483647", "2 3 1\n"),
                Arguments.of("3 1 2 3 -2147483648", "2 3 1\n"));
    }
}
