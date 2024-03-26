package org.example;

public final class MyString {
    private final char[] text;

    public MyString(char[] text) {
        this.text = text;
    }

    public MyString replace(char oldChar, char newChar) {
        char[] newText = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            if (text[i] == oldChar) {
                newText[i] = newChar;
            } else {
                newText[i] = text[i];
            }
        }

        return new MyString(newText);
    }
}
