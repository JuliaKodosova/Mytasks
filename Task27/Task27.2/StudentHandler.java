package sax;



import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.Student;

public class StudentHandler extends DefaultHandler
{
    private List<Student> students;
    private Student student;
    boolean bId = false;
    boolean bName = false;
    boolean bSurname = false;
    boolean bSubject = false;
    
    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {

        if (qName.equalsIgnoreCase("Student"))
        {
            String id = attributes.getValue("id");
            student = new Student();
            student.setId(Integer.parseInt(id));
            if (students == null)
            {
                students = new ArrayList<>();
            }
        }
        else if (qName.equalsIgnoreCase("Name"))
        {
            bName = true;
        }
        else if (qName.equalsIgnoreCase("id"))
        {
            bId = true;
        }
        else if (qName.equalsIgnoreCase("Surname"))
        {
            bSurname = true;
        }
        else if (qName.equalsIgnoreCase("Subject"))
        {
            bSubject = true;
        }
       }
    

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        if (qName.equalsIgnoreCase("Student"))
        {
            students.add(student);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException
    {

        if (bId)
        {
            student.setId(Integer.parseInt(new String(ch, start, length)));
            bId = false;
        }
        else if (bName)
        {
            student.setName(new String(ch, start, length));
            bName = false;
        }
        else if (bSurname)
        {
            student.setSurname(new String(ch, start, length));
            bSurname = false;
        }
        else if (bSubject)
        {
           student.setSubject(new String(ch, start, length));
            bSubject = false;
        }
        
    }
}
