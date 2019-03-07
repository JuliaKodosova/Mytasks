package Task11;

import java.util.*;

import static java.util.Arrays.*;

public class Dropdown {
    List<String> options;
    boolean isSelected;
    String name;

    public Dropdown(List< String > options, boolean isSelected, String name) {
        this.options = options;
        this.isSelected = isSelected;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dropdown{" +
                "options=" + options +
                ", isSelected=" + isSelected +
                ", name='" + name + '\'' +
                '}';
    }
}
