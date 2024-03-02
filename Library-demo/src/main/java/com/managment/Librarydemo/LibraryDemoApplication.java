package com.managment.Librarydemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Library API",version = "1.7"),
servers ={@Server(url = "http://localhost:8080"),@Server(url = "http://oneoone.com")} )
public class LibraryDemoApplication {
	private static final Logger logger= (Logger) LoggerFactory.getLogger(LibraryDemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(LibraryDemoApplication.class, args);
		logger.info("This is info Message");
		logger.error("This is Error Message");
		String parameter="World";
		try {
			int result=10/0;
		}
		catch (Exception e){
			logger.error("An Error occured during diivision"+e );
		}
			}

}
