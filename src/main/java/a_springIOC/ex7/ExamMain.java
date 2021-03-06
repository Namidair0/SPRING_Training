package a_springIOC.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/a_springIOC/ex7/test7.xml");
		BeanTest beanTest1 = (BeanTest) context.getBean("beanTest");
		BeanTest beanTest2 = (BeanTest) context.getBean("beanTest");
		
		System.out.println("beanTest1 : " + beanTest1);
		System.out.println("beanTest2 : " + beanTest2);
		System.out.println(beanTest1.hashCode());
		System.out.println(beanTest2.hashCode());
		
	}

}