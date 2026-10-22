package ru.bmstu.lab1.task_37;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 37 через стандартные потоки ввода и вывода. */
class Task37Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task37::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 2 3 4 5", "5 4 3 2 1\n"),
                Arguments.of("4 -1 0 2 -3", "-3 2 0 -1\n"),
                Arguments.of("2 7 7", "7 7\n"),
                Arguments.of("2 -2147483648 2147483647", "2147483647 -2147483648\n"));
    }
}
