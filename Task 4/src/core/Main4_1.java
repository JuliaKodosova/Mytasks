package core;

public class Main4_1 {

public static void main(String[] args) {
	Person person = new Person();
	person.setName("John");
	person.setSurname("Smith");
	person.setAge(28);
	person.setPhone(1234567890);
	person.printAllInformation();
	person.printName();
	System.out.println(person.isAdult());
}
}
