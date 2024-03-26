package org.example;

public class MyArrayList {
    private Integer[] values = new Integer[10];
    private Integer numberOfStoredElements = 0;

    public void addToEnd(Integer i) {
        if (numberOfStoredElements != values.length) {
            values[numberOfStoredElements] = i;
        } else {
            Integer[] newValues = new Integer[values.length * 2];
            for (int j = 0; j < numberOfStoredElements; j++) {
                newValues[j] = values[j];
            }
            newValues[numberOfStoredElements] = i;
            values = newValues;
        }
        numberOfStoredElements++;
    }


}
