package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        if (value == null) {
            throw new UserInputException("value could not be null");
        }
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{null}, "one");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
