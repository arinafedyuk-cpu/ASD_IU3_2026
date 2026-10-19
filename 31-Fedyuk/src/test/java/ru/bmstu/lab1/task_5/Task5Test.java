package ru.bmstu.lab1.task_5;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 5: обычные случаи, границы и точный консольный вывод. */
class Task5Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task5::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 100 2 100 3", "6\n"),
                Arguments.of("2 -7 4", "-7\n"),
                Arguments.of("4 2 9 3 9", "5\n"),
                Arguments.of("3 2147483647 0 2147483647", "4294967294\n"),
                Arguments.of("3 -2147483648 0 -2147483648", "-4294967296\n"),
                Arguments.of("2 0 0", "0\n"));
    }
}
