package org.face.SampleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext beanFactory = new ClassPathXmlApplicationContext("Resource/hlo.xml");
		
		
		
		HelloWorld h = (HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
		h.helloWorld();
    }
}
