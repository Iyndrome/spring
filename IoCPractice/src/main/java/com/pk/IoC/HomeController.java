package com.pk.IoC;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pk.IoC.domain.Item;
import com.pk.IoC.domain.ItemFactory;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Item item;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// Item 클래스(사용자 정의 자료형) 사용
		// static 변수나 메소드를 사용하는 경우를 제외하고는
		// class는 instance를 만들어서 사용
		
		//Item item = ItemFactory.create();		

		item.setCode("001");
		item.setName("밀감");
		item.setPrice("3000");

		System.out.println(item);		

		return "home";
	}

}