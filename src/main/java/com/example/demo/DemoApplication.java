package com.example.demo;

import egovframework.rte.fdl.cmmn.mail.SimpleSSLMail;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static Log logger = LogFactory.getLog(DemoApplication.class);
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		SimpleSSLMail simpleSSLMail = new SimpleSSLMail();
		logger.info(simpleSSLMail.getHost());
	}

}
