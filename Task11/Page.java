package Task11;

import com.sun.tools.javac.comp.Enter;

import java.util.*;

public class Page {
    ArrayList< Button > buttonCollection = new ArrayList< Button >();
    LinkedList< Field > fieldCollection = new LinkedList< Field >();
    HashSet< Label > labelCollection = new HashSet< Label >();
    HashMap< Integer, Dropdown > dropdownCollection = new HashMap< Integer, Dropdown >();

    float id;
    String title;

    public Page(float id, String title) {
        this.id = id;
        this.title = title;
    }

    public void addToArrayList(Button b) {
        buttonCollection.add(b);
    }

    public void removeFromArrayList(Button b) {
        buttonCollection.remove(b);
    }

    public void setInArrayList(int index, Button b) {
        buttonCollection.set(index, b);
    }

    public void printArrayList() {
        for (Button button : buttonCollection) {
            System.out.println(button.toString());
        }
    }

    public void addToLinkedList(Field f) {
        fieldCollection.add(f);
    }

    public void removeFromLinkedList(Field f) {
        fieldCollection.remove(f);
    }

    public void setInLinkedList(int index, Field b) {
        fieldCollection.set(index, b);
    }

    public void printLinkedList() {
        for (Field field : fieldCollection) {
            System.out.println(field.toString());
        }
    }

    public void addToHashSet(Label l) {
        labelCollection.add(l);
    }

    public void removeFromHashSet(Label l) {
        labelCollection.remove(l);
    }

    public void printHashSet() {
        for (Label label : labelCollection) {
            System.out.println(label.toString());
        }
    }

    public void addToHashMap(Integer key, Dropdown d) {
        dropdownCollection.put(key, d);
    }

    public void removeFromHashMap(Integer key) {
        dropdownCollection.remove(key);
    }

    public void setInHashMap(int index, Dropdown d) {
        dropdownCollection.replace(index, d);
    }

    public void printHashMap() {
        for (Dropdown values : dropdownCollection.values()) {
            System.out.println(values);
        }
}}