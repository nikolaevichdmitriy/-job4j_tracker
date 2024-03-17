package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
            if (value == null) {
                throw new ElementNotFoundException();
            }
        }
        return result;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        try {
            indexOf(new String[]{"one"}, "one");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
