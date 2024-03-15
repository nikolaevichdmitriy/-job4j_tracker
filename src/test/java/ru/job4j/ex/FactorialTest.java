package ru.job4j.ex;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    void whenNumberIsNegative() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.calc(-1);
        });
    }

    @Test
    void whenNumberIsZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void whenNumberIsPositive() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result).isEqualTo(120);
    }
}