package model;

public class Student
{
    private String name;
    private String surname;
    private String subject;
    private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", subject=" + subject + ", id=" + id + "]";
	}
	
	
}

    