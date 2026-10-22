package ru.bmstu.lab1.task_25;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 25 через стандартные потоки ввода и вывода. */
class Task25Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task25::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 -2 3 0 5", "7\n"),
                Arguments.of("2 0 0", "0\n"),
                Arguments.of("3 -1 -2 -3", "-6\n"),
                Arguments.of("2 2147483647 2147483647", "4294967294\n"),
                Arguments.of("2 -2147483648 -2147483648", "-4294967296\n"));
    }
}
