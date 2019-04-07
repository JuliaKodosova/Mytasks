package stax;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import model.Student;

public class StaxParser
{
    private static final String SURNAME = "Surname";
    private static final String NAME = "Name";
    private static final String SUBJECT = "Subject";
    private static final String ID = "id";
    private static final String STUDENT = "Student";
    
    private Student student;
    List<Student> students = new ArrayList<>();

    public List<Student> parse(XMLEventReader xmlEventReader) throws FileNotFoundException, XMLStreamException
    {
        while (xmlEventReader.hasNext())
        {
            XMLEvent xmlEvent = xmlEventReader.nextEvent();
            proceedStartElement(xmlEvent, xmlEventReader);
            proceedEndElement(xmlEvent);
        }
        return students;
    }

    private void proceedStartElement(XMLEvent xmlEvent, XMLEventReader xmlEventReader) throws XMLStreamException
    {
        if (xmlEvent.isStartElement())
        {
            StartElement startElement = xmlEvent.asStartElement();
            if (isTagNameEqual(startElement, STUDENT))
            {
                student = new Student();
                Attribute attribute = startElement.getAttributeByName(new QName(ID));
                if (attribute != null)
                {
                    student.setId(Integer.parseInt(attribute.getValue()));
                }
            }
            // set the other varibles from xml elements
            else if (isTagNameEqual(startElement, NAME))
            {
                student.setName(xmlEventReader.nextEvent().asCharacters().getData());
            }
           
            else if (isTagNameEqual(startElement, SURNAME))
            {
                student.setSurname(xmlEventReader.nextEvent().asCharacters().getData());
            }
            
            else if (isTagNameEqual(startElement, SUBJECT))
            {
               student.setSubject(xmlEventReader.nextEvent().asCharacters().getData());
            }
            
        }
    }

    private void proceedEndElement(XMLEvent xmlEvent)
    {
        if (xmlEvent.isEndElement())
        {
            EndElement endElement = xmlEvent.asEndElement();
            if (endElement.getName().getLocalPart().equalsIgnoreCase(STUDENT))
            {
                students.add(student);
            }
        }
    }

    private boolean isTagNameEqual(StartElement startElement, String tagName)
    {
        return startElement.getName().getLocalPart().equalsIgnoreCase(tagName);
    }
}
