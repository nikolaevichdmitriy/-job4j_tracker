package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(expected).isEqualTo(expected);
    }

    @Test
    void whenMax12To4To2Then12() {
        int x = 12;
        int left = 4;
        int right = 2;
        int result = Max.max(x, left, right);
        int expected = 12;
        assertThat(expected).isEqualTo(expected);
    }

    @Test
    void whenMax1To5To2To4Then5() {
        int x = 1;
        int z = 5;
        int left = 2;
        int right = 4;
        int result = Max.max(x, left, z, right);
        int expected = 5;
        assertThat(expected).isEqualTo(expected);
    }
}