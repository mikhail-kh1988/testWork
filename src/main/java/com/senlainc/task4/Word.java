package com.senlainc.task4;

import java.util.Objects;

public class Word {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word slovo = (Word) o;
        return Objects.equals(getString(), slovo.getString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getString());
    }
}
