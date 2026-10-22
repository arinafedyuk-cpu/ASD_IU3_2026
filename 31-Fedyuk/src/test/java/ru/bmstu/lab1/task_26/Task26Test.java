package ru.bmstu.lab1.task_26;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 26 через стандартные потоки ввода и вывода. */
class Task26Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task26::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("4 2 3 4 5", "120\n"),
                Arguments.of("3 2 0 -4", "0\n"),
                Arguments.of("2 -2 3", "1000000001\n"),
                Arguments.of("2 -2 -3", "6\n"),
                Arguments.of("2 1000000007 3", "0\n"),
                Arguments.of("2 -1000000007 -1", "0\n"),
                Arguments.of("2 2147483647 -2147483648", "1897632\n"));
    }
}
