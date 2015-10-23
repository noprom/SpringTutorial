package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		model.addAttribute("hello", "Your sister~");
		return "hello";
	}

	@RequestMapping(value = "/page/{name}/{age}", method = RequestMethod.GET)
	public String getName(ModelMap model, @PathVariable("name") String name, @PathVariable("age") String age) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "name";
	}

	@RequestMapping(value = "result", method = RequestMethod.GET)
	public String result(ModelMap model,@RequestParam String name, @RequestParam int age) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "result";
	}

	@RequestMapping(value = "adduser", method = RequestMethod.GET)
	public String addUser(ModelMap model) {
		return "adduser";
	}
}