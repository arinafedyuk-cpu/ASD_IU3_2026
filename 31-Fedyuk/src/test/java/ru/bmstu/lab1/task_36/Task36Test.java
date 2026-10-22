package ru.bmstu.lab1.task_36;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 36 через стандартные потоки ввода и вывода. */
class Task36Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task36::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 2 3 4 5", "1 3 6 10 15\n"),
                Arguments.of("3 -2 5 -7", "-2 3 -4\n"),
                Arguments.of("2 0 0", "0 0\n"),
                Arguments.of("2 2147483647 2147483647", "2147483647 4294967294\n"),
                Arguments.of("2 -2147483648 -2147483648", "-2147483648 -4294967296\n"));
    }
}
