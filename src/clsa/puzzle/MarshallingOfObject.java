package clsa.puzzle;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * // https://dzone.com/articles/introduction-to-jaxb-20
 * 
 * @author choudshe
 *
 */
public class MarshallingOfObject {

	public static void main(String[] args) {
			// code for marshalling
		
		try{
			    //creating the JAXB context
			    JAXBContext jContext = JAXBContext.newInstance(Student.class);
			    //creating the marshaller object
			    Marshaller marshallObj = jContext.createMarshaller();
			    //setting the property to show xml format output
			    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			    //setting the values in POJO class
			    Student student = new Student("Shekhar",1234,"Java");
			    //calling the marshall method
			    marshallObj.marshal(student, new FileOutputStream("student.xml"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// code for unmarshalling
		

		try{
		    //getting the xml file to read
		    File file = new File("student.xml");
		    //creating the JAXB context
		    JAXBContext jContext = JAXBContext.newInstance(Student.class);
		    //creating the unmarshall object
		    Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
		    //calling the unmarshall method
		    Student student=(Student) unmarshallerObj.unmarshal(file);
		    System.out.println(student.getName()+" "+student.getId()+" "+student.getSubject());
		}catch(Exception e){
		    e.printStackTrace();
		}
	}
}

@XmlRootElement
class Student {

	private String name;
	private int id;
	private String subject;

	Student() {
	}

	Student(String name, int id, String subject) {
		this.name = name;
		this.id = id;
		this.subject = subject;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}