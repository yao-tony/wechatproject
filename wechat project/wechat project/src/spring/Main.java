package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource; 
@SuppressWarnings("deprecation")
public class Main {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
       //import config file
       Resource r = new FileSystemResource("helloMessage.xml");
       //load config file
       BeanFactory f = new XmlBeanFactory(r);
       //get person instance
       Person person = (Person) f.getBean("person");
       String s = person.sayHello();
/*        ApplicationContext context = new ClassPathXmlApplicationContext("helloMessage.xml");
        Person person = (Person) context.getBean("person");
        String s = person.sayHello();*/
       System.out.println(s);
   }

}