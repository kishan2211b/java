package com.example.Sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "Hiii Buddyy.... !";
	}
	
	@GetMapping("/add/{a}/{b}")
	@ResponseBody
	public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return (a+b);
	}
	@GetMapping("/addition")
	@ResponseBody
	public int addition(@RequestParam("a") int a,@RequestParam(value="b",defaultValue="20") int b) {
		return (a+b);
	}
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	@RequestMapping("/greeting")
	public String welcome() {
		return "hello";
	}
}
