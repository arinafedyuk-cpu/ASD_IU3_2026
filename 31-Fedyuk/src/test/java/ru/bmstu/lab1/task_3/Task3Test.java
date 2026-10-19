package ru.bmstu.lab1.task_3;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 3: обычные случаи, границы и точный консольный вывод. */
class Task3Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task3::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 2 1 3 1 1", "3\n"),
                Arguments.of("2 4 4 4", "2\n"),
                Arguments.of("2 1 2 7", "0\n"),
                Arguments.of("3 -1 0 -1 -1", "2\n"),
                Arguments.of("2 2147483647 -2147483648 -2147483648", "1\n"));
    }
}
