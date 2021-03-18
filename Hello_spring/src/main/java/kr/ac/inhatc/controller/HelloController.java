package kr.ac.inhatc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("1hello")
	public String hello() {
		System.out.println("호출됨");
		return "hello spring";
	}
}
