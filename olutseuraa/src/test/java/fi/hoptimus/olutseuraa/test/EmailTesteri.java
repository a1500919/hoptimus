package fi.hoptimus.olutseuraa.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.hoptimus.olutseuraa.service.Emailer;

public class EmailTesteri {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
 
		// Spring Bean file you specified in /src/main/resources folder
		String configtiedostot = "spring-email-config.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(configtiedostot);
 
		// @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
		Emailer mailer = (Emailer) context.getBean("emaileri");
		String toAddr = "testimeilihoptimus@gmail.com";
		String fromAddr = "testimeilihoptimus@gmail.com";
		// email subject
		String subject = "Hei! T�m� on automaattinen viesti, jonka testimeileri l�hetti!";
		// email body
		String body = "T�m� on automaattinen viesti Emailerin testaamisesta. - Hoptimus Team.";
		mailer.send(toAddr, fromAddr, subject, body);
	}
	
}
