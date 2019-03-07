package Task11;

public class Button {
     String name;
    String action;

    public Button(String name,String action){
        this.action=action;
        this.name=name;
    }
 public String toString(){
        return "button name: "+this.name + " "+"button action: "+ this.action;
 }
}
