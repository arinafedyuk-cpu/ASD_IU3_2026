package ru.bmstu.lab1.task_4;

import static ru.bmstu.lab1.support.ConsoleAssertions.assertOutput;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Проверки задачи 4: обычные случаи, границы и точный консольный вывод. */
class Task4Test {
    @ParameterizedTest
    @MethodSource("examples")
    void shouldProduceExpectedConsoleOutput(String input, String expected) {
        assertOutput(input, expected, Task4::main);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("5 2 7 2 3 2 2", "0 2 4\n"),
                Arguments.of("2 7 7 7", "0 1\n"),
                Arguments.of("2 1 2 9", "\n"),
                Arguments.of("3 0 1 2 2", "2\n"),
                Arguments.of("3 -1 -1 2 -1", "0 1\n"));
    }
}
