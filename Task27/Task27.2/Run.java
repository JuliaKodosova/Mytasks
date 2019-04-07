package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import dom.DomParser;
import model.Student;
import sax.StudentHandler;
import stax.StaxParser;

public class Run
{

    private static final String STUDENTS_XML = "students.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException,
            XMLStreamException {
    	
        System.out.println(" ========================= SAX parser ==============================");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        StudentHandler studentHandler = new StudentHandler();
        saxParser.parse(new File(STUDENTS_XML), studentHandler);
        List<Student> students = studentHandler.getStudents();
       students.forEach(student -> System.out.println(student));

        System.out.println(" ============================== STAX parser =========================");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(STUDENTS_XML));
        students = new StaxParser().parse(xmlEventReader);
        students.forEach(student -> System.out.println(student));

        System.out.println(" ============================== DOM parser =========================");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(STUDENTS_XML);
        students = new DomParser().parse(document);
        students.forEach(student -> System.out.println(student));
    }

}
