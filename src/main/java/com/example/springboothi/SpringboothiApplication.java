package com.example.springboothi;

import newpackage.welcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.IContext;

@SpringBootApplication
public class SpringboothiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringboothiApplication.class, args);

	}
	@RestController
	class HelloWorldController {

		@GetMapping("/")
		public String hello() {
			return "<html>" +
					"<body>" +
					"<h1 style='color:green;'>" +
					"Hello, welcome to my deployed springboot application <div>" +
					"This is for demonstration purposes only <div>" +
					"Developed by Sibonginkosi Bonefanture Mashele" +
					"</h1>" +
					"</body>" +
					"</html>";
		}
	}

}
