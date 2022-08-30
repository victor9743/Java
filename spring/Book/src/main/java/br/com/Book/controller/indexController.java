package br.com.Book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	@GetMapping("/books")
	public ModelAndView geyList() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
