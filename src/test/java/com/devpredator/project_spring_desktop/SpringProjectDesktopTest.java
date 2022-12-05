/**
 * 
 */
package com.devpredator.project_spring_desktop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devpredator.project_spring_desktop.dao.impl.DisqueraDAOImpl;

/**
 * @author leonardo
 *
 */
class SpringProjectDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		assertNotNull(context);
		
		DisqueraDAOImpl disqueraDAOImpl =  (DisqueraDAOImpl) context.getBean("DisqueraDAOImpl");
		
		assertNotNull(disqueraDAOImpl);
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAOImpl);
		
		Properties properties = (Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}

}
