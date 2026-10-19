package ru.bmstu.lab1.task_9;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 9: обычные случаи, границы и точный консольный вывод. */
class Task9Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task9::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 -2 -2 0 3 3", "YES\n"),
                Arguments.of("2 3 2", "NO\n"),
                Arguments.of("3 1 3 2", "NO\n"),
                Arguments.of("2 5 5", "YES\n"),
                Arguments.of("2 -2147483648 2147483647", "YES\n"),
                Arguments.of("3 3 1 2", "NO\n"));
    }
}
