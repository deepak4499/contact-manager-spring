package com.example.contactmanagerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.ui.Model;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ContactManagerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerDemoApplication.class, args);
	}

	public static String indexLayout(Model model, String fragment) {
		model.addAttribute("pageFragment", fragment);
		return "index";
	}
}
