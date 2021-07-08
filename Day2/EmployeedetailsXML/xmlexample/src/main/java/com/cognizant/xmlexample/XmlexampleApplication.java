package com.cognizant.xmlexample;

import java.util.ArrayList;

import com.cognizant.xmlexample.model.EmployeeModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan({"com.cognizant.xmlexample.model"})
public class XmlexampleApplication {

	private static final Logger LOG = LoggerFactory.getLogger(XmlexampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(XmlexampleApplication.class, args);
		LOG.info("Inside Main");
	}
	public static void displayEmployee(){
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeDetails.xml");
		ArrayList<EmployeeModel> list=context.getBean("EmployeeList",java.util.ArrayList.class);
		LOG.debug("List: {}", list);
	}

}
