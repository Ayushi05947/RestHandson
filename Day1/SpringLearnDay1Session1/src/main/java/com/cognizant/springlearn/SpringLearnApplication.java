package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.springlearn.model.Country;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan({"com.cognizant.springlearn.model"})
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("Runnning");
		//displayDate();
		//displayCountry();
		//displayListOfCountries();
	}
	
	//to display date in format(dd/mm/yyyy)
	public static void displayDate() {
		
		LOGGER.info("START");
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 try {
			Date date=format.parse("31/12/2018");
			LOGGER.debug(date.toString());
			System.out.println("Date is: "+date);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		 
		 LOGGER.info("END");
	}
	
	//to display single country
	/*public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.debug("Country : {}", anotherCountry.toString());
	}*/

	//to display list of all countries
	public static void displayListOfCountries() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");	
		ArrayList<Country> list=context.getBean("countryList",java.util.ArrayList.class);
		LOGGER.debug("List: {}", list);
		LOGGER.info("END");
	}

}