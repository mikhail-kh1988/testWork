package com.senlainc.task1;

import java.util.Objects;

public class Number {
    private boolean evenNumber;
    private boolean compositeNumber;
    private int number;

    public Number(int aNumber){
        number = aNumber;
    }

    public boolean isEvenNumber() {
        return evenNumber;
    }

    public void setEvenNumber(boolean evenNumber) {
        this.evenNumber = evenNumber;
    }

    public boolean isCompositeNumber() {
        return compositeNumber;
    }

    public void setCompositeNumber(boolean compositeNumber) {
        this.compositeNumber = compositeNumber;
    }

    public void setNumber(int bNumber){
        this.number = bNumber;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Число: ");
        string.append(number);
        string.append(", ");
        if (evenNumber)
            string.append("четное, ");
        else
            string.append("не четное, ");
        if (compositeNumber)
            string.append("простое.");
        else
            string.append("составное.");
        return string.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        Number number1 = (Number) o;
        return isEvenNumber() == number1.isEvenNumber() && isCompositeNumber() == number1.isCompositeNumber() && number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEvenNumber(), isCompositeNumber(), number);
    }
}
