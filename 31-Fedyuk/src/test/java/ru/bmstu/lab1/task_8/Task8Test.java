package ru.bmstu.lab1.task_8;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 8: обычные случаи, границы и точный консольный вывод. */
class Task8Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task8::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("7 0 -2 4 -1 0 3 -7", "4 3\n-2 -1 -7\n"),
                Arguments.of("2 0 0", "\n\n"),
                Arguments.of("3 2 1 4", "2 1 4\n\n"),
                Arguments.of("3 -1 -3 -2", "\n-1 -3 -2\n"),
                Arguments.of("2 -2147483648 2147483647", "2147483647\n-2147483648\n"));
    }
}
