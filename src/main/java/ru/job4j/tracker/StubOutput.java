package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();
    private final Output output;

    public StubOutput(Output output) {
        this.output = output;
    }

    @Override
    public void println(Object object) {
        if (object != null) {
            buffer.append(object.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
