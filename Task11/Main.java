package Task11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button("Enter", "enters data");
        Button button2 = new Button("Add", "adds data");
        Button button3 = new Button("Delete", "deletes data");
        Button button4=new Button("Update","update data");
        Page page = new Page(1, "number 1");
        page.addToArrayList(button1);
        page.addToArrayList(button2);
        page.addToArrayList(button3);
        page.removeFromArrayList(button2);
        page.setInArrayList(1,button4);
        page.printArrayList();

        Field field1=new Field(1,"name");
        Field field2=new Field(2,"surname");
        Field field3=new Field(3,"phone");
        Field field4=new Field(4,"email");
        page.addToLinkedList(field1);
        page.addToLinkedList(field2);
        page.addToLinkedList(field3);
        page.removeFromLinkedList(field2);
        page.setInLinkedList(1,field4);
        page.printLinkedList();

        Label label1=new Label("Label1");
        Label label2=new Label("Label2");
        Label label3=new Label("Label3");
        page.addToHashSet(label1);
        page.addToHashSet(label2);
        page.addToHashSet(label3);
        page.removeFromHashSet(label2);
        page.printHashSet();

        List<String> options = Arrays.asList("1", "2", "3","4");
        Dropdown dropdown1=new Dropdown(options,true,"DropdownOfNames");
        Dropdown dropdown2=new Dropdown(options,true,"DropdownOfSurnames");
        Dropdown dropdown3=new Dropdown(options,true,"DropdownOfPhones");
        Dropdown dropdown4=new Dropdown(options,true,"DropdownOfEmails");
        page.addToHashMap(1,dropdown1);
        page.addToHashMap(2,dropdown2);
        page.addToHashMap(3,dropdown3);
        page.addToHashMap(4,dropdown4);
        page.removeFromHashMap(2);
        page.setInHashMap(4,dropdown1);
        page.printHashMap();
    }
}