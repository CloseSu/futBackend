package com.futureBacken.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.futureBacken.model.Future;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 4800, allowCredentials = "false") 
public class FutureDataController {
	
	@RequestMapping(value = "/getTodayData", method = RequestMethod.GET, produces = "application/json")
	public Future getTodayData() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Documents\\sourceCode\\TDD-20170821T012436Z-001\\TDD\\TDD.Java\\Tools\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		return null;
	}
}
