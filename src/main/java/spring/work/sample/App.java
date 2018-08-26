package spring.work.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/work/beans/beans.xml");
		Person person = (Person)context.getBean("person");
		
		person.speak();
		((ClassPathXmlApplicationContext)context).close();
	}

}
