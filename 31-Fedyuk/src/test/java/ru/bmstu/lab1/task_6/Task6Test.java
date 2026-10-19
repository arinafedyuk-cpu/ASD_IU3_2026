package ru.bmstu.lab1.task_6;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 6: обычные случаи, границы и точный консольный вывод. */
class Task6Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task6::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 1 2 3 4 5", "2\n"),
                Arguments.of("2 7 7", "0\n"),
                Arguments.of("3 -9 -6 -3", "1\n"),
                Arguments.of("3 2147483645 2147483646 2147483647", "1\n"),
                Arguments.of("3 -2147483648 -2147483647 -2147483646", "1\n"),
                Arguments.of("3 -3 0 3", "1\n"));
    }
}
