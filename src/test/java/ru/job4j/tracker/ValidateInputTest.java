package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.lnput.Input;
import ru.job4j.tracker.lnput.MockInput;
import ru.job4j.tracker.lnput.ValidateInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidInputPositive() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[]{"1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidInputMultiple() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[]{"1", "2", "6"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(6);
    }

    @Test
    void whenInvalidInputNegative() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[]{"-1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}