package dom;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Student;

public class DomParser
{
    public List<Student> parse(Document document) throws FileNotFoundException, XMLStreamException
    {
        NodeList nodeList = document.getElementsByTagName("Student");
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            students.add(getStudent(nodeList.item(i)));
        }
        return students;
    }

    private static Student getStudent(Node node)
    {
       Student student = new Student();
        Element element = (Element) node;
        student.setId(Integer.parseInt(element.getAttribute("id")));
        student.setName(getTagValue("Name", element));
        student.setSurname(getTagValue("Surname", element));
        student.setSubject(getTagValue("Subject", element));
        
        return student;
    }

    private static int getTagAttribute(String string, Element element) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String getTagValue(String tag, Element element)
    {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}
